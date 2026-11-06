package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class uh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public uh(c40 c40Var, Rect rect) {
        this.a = 1;
        this.d = c40Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e30 e30Var;
        switch (this.a) {
            case 0:
                an anVar = (an) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        anVar.O7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = anVar.e9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = anVar.e9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int i10 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i7;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i7, i10, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            anVar.O7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                c40 c40Var = (c40) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (e30Var = c40Var.W4) != null && e30Var.isShowing()) {
                        c40Var.W4.dismiss();
                        break;
                    }
                } else {
                    e30 e30Var2 = c40Var.W4;
                    if (e30Var2 != null && e30Var2.isShowing()) {
                        View contentView2 = c40Var.W4.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int i12 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i11;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i11, i12, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            c40Var.W4.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public uh(an anVar, Rect rect) {
        this.a = 0;
        this.d = anVar;
        this.c = rect;
        this.b = new int[2];
    }
}
