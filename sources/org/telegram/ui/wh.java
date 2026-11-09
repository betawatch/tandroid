package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public wh(e40 e40Var, Rect rect) {
        this.a = 1;
        this.d = e40Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g30 g30Var;
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        cnVar.P7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = cnVar.e9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = cnVar.e9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int i10 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i7;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i7, i10, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            cnVar.P7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                e40 e40Var = (e40) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (g30Var = e40Var.W4) != null && g30Var.isShowing()) {
                        e40Var.W4.dismiss();
                        break;
                    }
                } else {
                    g30 g30Var2 = e40Var.W4;
                    if (g30Var2 != null && g30Var2.isShowing()) {
                        View contentView2 = e40Var.W4.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int i12 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i11;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i11, i12, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            e40Var.W4.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public wh(cn cnVar, Rect rect) {
        this.a = 0;
        this.d = cnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
