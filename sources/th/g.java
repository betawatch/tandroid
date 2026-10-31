package th;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends tk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ uw f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(uw uwVar, Context context, int i10) {
        super(context, null);
        this.e3 = i10;
        this.f3 = uwVar;
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.e3) {
            case 1:
                uw uwVar = this.f3;
                ArrayList arrayList = uwVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    l lVar = (l) getChildAt(i11);
                    int R = RecyclerView.R(lVar);
                    lVar.b = R;
                    boolean z10 = true;
                    lVar.a = true;
                    lVar.d = R == 0;
                    if (R != uwVar.D.size() - 1) {
                        z10 = false;
                    }
                    lVar.c = z10;
                    arrayList.add(lVar);
                }
                Collections.sort(arrayList, uwVar.w0);
                while (i10 < arrayList.size()) {
                    l lVar2 = (l) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(lVar2.getX(), lVar2.getY());
                    if (lVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), (int) (lVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(lVar2.getScaleX(), lVar2.getScaleY(), org.telegram.messenger.i0.L(14.0f), lVar2.getCy());
                    lVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i10++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    uw uwVar = this.f3;
                    if (uwVar.c0 > 0.2f || uwVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.e3) {
            case 0:
                if (!this.f3.P.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        switch (this.e3) {
            case 1:
                vh.p2 p2Var = this.f3.J;
                if (p2Var != null) {
                    p2Var.e(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.e3) {
            case 0:
                ArrayList arrayList = this.f3.b0;
                super.onLayout(z10, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
