package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public wh(f40 f40Var, Rect rect) {
        this.a = 1;
        this.d = f40Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h30 h30Var;
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
                f40 f40Var = (f40) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (h30Var = f40Var.Z4) != null && h30Var.isShowing()) {
                        f40Var.Z4.dismiss();
                        break;
                    }
                } else {
                    h30 h30Var2 = f40Var.Z4;
                    if (h30Var2 != null && h30Var2.isShowing()) {
                        View contentView2 = f40Var.Z4.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int i12 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i11;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i11, i12, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            f40Var.Z4.dismiss();
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
