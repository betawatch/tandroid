// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v82 extends bf0 {
    public final u82 H;
    public final /* synthetic */ d I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ ylb K;
    public final /* synthetic */ z82 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v82(z82 z82Var, Context context, d dVar, boolean z, ylb ylbVar) {
        super(context);
        this.L = z82Var;
        this.I = dVar;
        this.J = z;
        this.K = ylbVar;
        this.H = new u82(this);
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        z82 z82Var = this.L;
        if (!z82Var.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        u82 u82Var = this.H;
        u82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        u82Var.a = true;
        u82Var.v = true;
        u82Var.J = this.K;
        Integer num = z82Var.c;
        if (num != null) {
            u82Var.z = num.intValue();
        }
        yv1 yv1Var = z82Var.H;
        if (yv1Var != null) {
            j = yv1Var.a();
        } else {
            d dVar = this.I;
            j = dVar instanceof sxb ? -((sxb) dVar).a : 0L;
        }
        y4b.h(j, canvas, this.a, u82Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().E()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(jb6.M0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(2131747550, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
