package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class j2 extends org.telegram.ui.ActionBar.i5 {
    public AnimatorSet f;
    public final /* synthetic */ z2 h;

    public j2(z2 z2Var) {
        this.h = z2Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        z2 z2Var = this.h;
        k2 k2Var = z2Var.d;
        q2 q2Var = z2Var.C;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        q2Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = z2Var.D.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        k2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(k2Var, (Property<k2, Float>) property3, 1.0f));
        k2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(z2Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(pr.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ex0(15, this, searchField));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        z2 z2Var = this.h;
        k2 k2Var = z2Var.d;
        FrameLayout frameLayout = z2Var.h;
        q2 q2Var = z2Var.C;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = z2Var.D.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(k2Var, (Property<k2, Float>) property3, 0.0f));
        k2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        z2Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(pr.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new i2(this, 0));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        r2 r2Var = this.h.r;
        org.telegram.ui.web.s0 s0Var = r2Var.v;
        if (!TextUtils.equals(r2Var.f, obj)) {
            if (r2Var.e != -1) {
                ConnectionsManager.getInstance(r2Var.w.a).cancelRequest(r2Var.e, true);
                r2Var.e = -1;
            }
            r2Var.d = false;
            r2Var.h = null;
        }
        r2Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(s0Var);
        if (!TextUtils.isEmpty(obj)) {
            r2Var.F(true);
            AndroidUtilities.runOnUIThread(s0Var, 1500L);
        } else {
            r2Var.c.clear();
            r2Var.F(false);
            r2Var.l();
        }
    }
}
