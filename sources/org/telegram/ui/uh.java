package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public uh(e40 e40Var, Rect rect) {
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
                bn bnVar = (bn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        bnVar.P7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = bnVar.g9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = bnVar.g9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int i10 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i7;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i7, i10, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            bnVar.P7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                e40 e40Var = (e40) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (g30Var = e40Var.e5) != null && g30Var.isShowing()) {
                        e40Var.e5.dismiss();
                        break;
                    }
                } else {
                    g30 g30Var2 = e40Var.e5;
                    if (g30Var2 != null && g30Var2.isShowing()) {
                        View contentView2 = e40Var.e5.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int i12 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i11;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i11, i12, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            e40Var.e5.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public uh(bn bnVar, Rect rect) {
        this.a = 0;
        this.d = bnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
