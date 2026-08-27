package zf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import h7.z5;
import lh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w2 extends j {
    public final r0 m0;
    public boolean n0;
    public int o0;
    public int p0;
    public final pc q0;

    public w2(Context context, PointF pointF, int i10, pc pcVar, float f10, int i11) {
        super(context, pointF);
        r0 r0Var = new r0(context, f10);
        this.m0 = r0Var;
        r0Var.setMaxWidth(i11);
        r0Var.e(0, this.o0);
        this.q0 = pcVar;
        String str = pcVar.c;
        String a2 = pcVar.a();
        r0Var.d(i10, str);
        r0Var.setText(a2);
        m();
        addView(r0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // zf.j
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.o0;
    }

    @Override // zf.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // zf.j
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float t10 = rl.t(dp, 2.0f, getPositionX(), scaleX);
        return new yj0(t10, rl.t(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + t10) - t10, dp2 * scaleX);
    }

    @Override // zf.j
    public float getStickyPaddingBottom() {
        return this.m0.F;
    }

    @Override // zf.j
    public float getStickyPaddingLeft() {
        return this.m0.E;
    }

    @Override // zf.j
    public float getStickyPaddingRight() {
        return this.m0.E;
    }

    @Override // zf.j
    public float getStickyPaddingTop() {
        return this.m0.F;
    }

    public int getType() {
        return this.p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.n0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.n0 = true;
        this.o0 = i10;
    }

    @Override // zf.j
    public void setIsVideo(boolean z10) {
        this.m0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.p0 = i10;
        this.m0.e(i10, this.o0);
    }
}
