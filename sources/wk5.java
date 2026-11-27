// default package

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public interface wk5 {
    e getBackgroundFragment();

    nx0 getBottomSheet();

    List getFragmentStack();

    e getLastFragment();

    t37 getMessageDrawableOutMediaStart();

    t37 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    e getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(sk5 sk5Var);

    void setDrawerLayoutContainer(dr3 dr3Var);

    void setFragmentPanTranslationOffset(int i);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z);

    void setInBubbleMode(boolean z);

    void setIsSheet(boolean z);

    void setNavigationBarColor(int i);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z);

    void setUseAlphaAnimations(boolean z);

    void setWindow(Window window);
}
