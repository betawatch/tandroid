package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w31 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final org.telegram.ui.Components.d11 d;
    public boolean e;
    public long f;
    public long h;
    public final org.telegram.ui.Components.mi0 n;
    public final TextPaint r;
    public StaticLayout s;
    public float v;
    public float w;
    public final /* synthetic */ SecretMediaViewer x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.x = secretMediaViewer;
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.d11();
        this.r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.fire_on, AndroidUtilities.dp(16.0f), "" + R.raw.fire_on, AndroidUtilities.dp(16.0f));
        this.n = mi0Var;
        mi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mi0Var.r0 = this;
        mi0Var.start();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w31.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float dpf2 = AndroidUtilities.dpf2(10.5f);
        this.c.set(measuredWidth - dpf2, measuredHeight - dpf2, measuredWidth + dpf2, dpf2 + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
