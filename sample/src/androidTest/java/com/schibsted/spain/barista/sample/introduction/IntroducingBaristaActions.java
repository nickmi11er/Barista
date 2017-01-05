package com.schibsted.spain.barista.sample.introduction;

import android.support.test.runner.AndroidJUnit4;

import com.schibsted.spain.barista.sample.R;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.schibsted.spain.barista.BaristaAutoCompleteTextViewActions.writeToAutoCompleteTextView;
import static com.schibsted.spain.barista.BaristaCheckBoxActions.clickCheckBoxItem;
import static com.schibsted.spain.barista.BaristaClickActions.click;
import static com.schibsted.spain.barista.BaristaClickActions.clickBack;
import static com.schibsted.spain.barista.BaristaEditTextActions.writeToEditText;
import static com.schibsted.spain.barista.BaristaListViewActions.clickListViewItem;
import static com.schibsted.spain.barista.BaristaPickerActions.setDateOnPicker;
import static com.schibsted.spain.barista.BaristaRadioButtonActions.clickRadioButtonItem;
import static com.schibsted.spain.barista.BaristaRecyclerViewActions.clickRecyclerViewItem;
import static com.schibsted.spain.barista.BaristaScrollActions.scrollTo;
import static com.schibsted.spain.barista.BaristaSpinnerActions.clickSpinnerItem;
import static com.schibsted.spain.barista.BaristaSwipeActions.swipePagerBack;
import static com.schibsted.spain.barista.BaristaSwipeActions.swipePagerForward;

@RunWith(AndroidJUnit4.class)
public class IntroducingBaristaActions {

    @Test
    @Ignore
    public void letsIntroduceBarista() {
        // Click widgets
        click(R.id.button);
        click("Next");
        clickBack();

        // Writing into widgets
        writeToEditText(R.id.edittext, "A great text");
        writeToAutoCompleteTextView(R.id.autocomplete, "Another great text");

        // Select item on AdapterViews
        clickListViewItem(R.id.listview, 4);
        clickListViewItem(R.id.listview, 4, 5, 6);
        clickRecyclerViewItem(R.id.recycler, 2);
        clickRecyclerViewItem(R.id.recycler, 2, 3, 4);
        clickSpinnerItem(R.id.spinner, 1);

        // Picker inputs
        setDateOnPicker(1986, 03, 23);

        // Scroll on widgets
        scrollTo(R.id.button);
        scrollTo("A widget with this text");
        swipePagerForward(R.id.viewPager);
        swipePagerBack(R.id.viewPager);

        // Actions on RadioButtons and CheckBoxes
        clickCheckBoxItem(R.id.first_item);
        clickCheckBoxItem("The checkbox text");
        clickRadioButtonItem(R.id.radiogroup, R.id.first_item);
        clickRadioButtonItem(R.id.radiogroup, "The radio text");
    }
}