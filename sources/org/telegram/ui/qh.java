package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public qh(x30 x30Var, Rect rect) {
        this.a = 1;
        this.d = x30Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z20 z20Var;
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        wmVar.O7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var = wmVar.f9;
                    if (f1Var != null && f1Var.isShowing()) {
                        View contentView = wmVar.f9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i3 = iArr[0];
                        int i10 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i3;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i3, i10, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            wmVar.O7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                x30 x30Var = (x30) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (z20Var = x30Var.X4) != null && z20Var.isShowing()) {
                        x30Var.X4.dismiss();
                        break;
                    }
                } else {
                    z20 z20Var2 = x30Var.X4;
                    if (z20Var2 != null && z20Var2.isShowing()) {
                        View contentView2 = x30Var.X4.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int i12 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i11;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i11, i12, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            x30Var.X4.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public qh(wm wmVar, Rect rect) {
        this.a = 0;
        this.d = wmVar;
        this.c = rect;
        this.b = new int[2];
    }
}
