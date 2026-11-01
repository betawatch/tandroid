package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qi implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public qi(a50 a50Var, Rect rect) {
        this.a = 1;
        this.d = a50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        b40 b40Var;
        switch (this.a) {
            case 0:
                un unVar = (un) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        unVar.M7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.k1 k1Var = unVar.e9;
                    if (k1Var != null && k1Var.isShowing()) {
                        View contentView = unVar.e9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            unVar.M7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                a50 a50Var = (a50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (b40Var = a50Var.W4) != null && b40Var.isShowing()) {
                        a50Var.W4.dismiss();
                        break;
                    }
                } else {
                    b40 b40Var2 = a50Var.W4;
                    if (b40Var2 != null && b40Var2.isShowing()) {
                        View contentView2 = a50Var.W4.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            a50Var.W4.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public qi(un unVar, Rect rect) {
        this.a = 0;
        this.d = unVar;
        this.c = rect;
        this.b = new int[2];
    }
}
