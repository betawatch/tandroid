package ug;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ni0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m0 extends j {
    public final l0 r0;
    public boolean s0;
    public int t0;
    public int u0;
    public TLRPC.MessageMedia v0;
    public TL_stories.MediaArea w0;

    public m0(Context context, PointF pointF, int i3, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        l0 l0Var = new l0(context, f10);
        this.r0 = l0Var;
        l0Var.setMaxWidth(i10);
        r(i3, messageMedia, mediaArea);
        l0Var.e(0, this.t0);
        addView(l0Var, mf.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String o10 = a1.g.o((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(o10);
        l10.append(floor2 <= 0.0d ? "0" : "");
        l10.append(floor2 < 10.0d ? "0" : "");
        String o11 = a1.g.o((int) floor2, "'", l10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(o11);
        l11.append(floor3 <= 0.0d ? "0" : "");
        l11.append(floor3 < 10.0d ? "0" : "");
        return a1.g.o((int) floor3, "\"", l11);
    }

    @Override // ug.j
    public final i a() {
        return new i0(this, getContext());
    }

    public int getColor() {
        return this.t0;
    }

    @Override // ug.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // ug.j
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ni0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // ug.j
    public float getStickyPaddingBottom() {
        return this.r0.K;
    }

    @Override // ug.j
    public float getStickyPaddingLeft() {
        return this.r0.J;
    }

    @Override // ug.j
    public float getStickyPaddingRight() {
        return this.r0.J;
    }

    @Override // ug.j
    public float getStickyPaddingTop() {
        return this.r0.K;
    }

    public int getType() {
        return this.u0;
    }

    public int getTypesCount() {
        return this.r0.getTypesCount() - (!this.s0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public final void r(int i3, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.v0 = messageMedia;
        this.w0 = mediaArea;
        String str2 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            sb2.append(d > 0.0d ? "N" : "S");
            sb2.append(" ");
            sb2.append(q(d10));
            sb2.append(d10 > 0.0d ? "E" : "W");
            str = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str2 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        l0 l0Var = this.r0;
        l0Var.d(i3, str2);
        l0Var.setText(str);
        m();
    }

    public void setColor(int i3) {
        this.s0 = true;
        this.t0 = i3;
    }

    public void setMaxWidth(int i3) {
        this.r0.setMaxWidth(i3);
    }

    public void setType(int i3) {
        this.u0 = i3;
        this.r0.e(i3, this.t0);
    }
}
