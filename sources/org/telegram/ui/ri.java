package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ri implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ri(n60 n60Var, Rect rect) {
        this.a = 1;
        this.d = n60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n50 n50Var;
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        foVar.D7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = foVar.Q8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            foVar.D7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                n60 n60Var = (n60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (n50Var = n60Var.f3) != null && n50Var.isShowing()) {
                        n60Var.f3.dismiss();
                        break;
                    }
                } else {
                    n50 n50Var2 = n60Var.f3;
                    if (n50Var2 != null && n50Var2.isShowing()) {
                        View contentView2 = n60Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            n60Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ri(fo foVar, Rect rect) {
        this.a = 0;
        this.d = foVar;
        this.c = rect;
        this.b = new int[2];
    }
}
