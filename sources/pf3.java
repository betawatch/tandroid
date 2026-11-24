// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class pf3 extends o39 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ oh3 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf3(oh3 oh3Var, Context context, byte b) {
        super(context, null);
        this.f3 = b;
        this.g3 = oh3Var;
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f3) {
            case 1:
                oh3 oh3Var = this.g3;
                ArrayList arrayList = oh3Var.Q;
                arrayList.clear();
                int i = 0;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    uf3 uf3Var = (uf3) getChildAt(i2);
                    int R = RecyclerView.R(uf3Var);
                    uf3Var.b = R;
                    boolean z = true;
                    uf3Var.a = true;
                    uf3Var.d = R == 0;
                    if (R != oh3Var.E.size() - 1) {
                        z = false;
                    }
                    uf3Var.c = z;
                    arrayList.add(uf3Var);
                }
                Collections.sort(arrayList, oh3Var.x0);
                while (i < arrayList.size()) {
                    uf3 uf3Var2 = (uf3) arrayList.get(i);
                    int save = canvas.save();
                    canvas.translate(uf3Var2.getX(), uf3Var2.getY());
                    if (uf3Var2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-gl.L(4.0f), -gl.L(4.0f), gl.L(50.0f), gl.L(50.0f), (int) (uf3Var2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(uf3Var2.getScaleX(), uf3Var2.getScaleY(), gl.L(14.0f), uf3Var2.getCy());
                    uf3Var2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    oh3 oh3Var = this.g3;
                    if (oh3Var.d0 > 0.2f || oh3Var.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.f3) {
            case 0:
                if (!this.g3.Q.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        switch (this.f3) {
            case 1:
                je5 je5Var = this.g3.K;
                if (je5Var != null) {
                    je5Var.f(true);
                    break;
                }
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 0:
                ArrayList arrayList = this.g3.c0;
                super.onLayout(z, i, i2, i3, i4);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((Runnable) arrayList.get(i5)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
