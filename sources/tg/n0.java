package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ha;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ki0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n0 extends j {
    public final m0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public TLRPC.MessageMedia u0;
    public TL_stories.MediaArea v0;

    public n0(Context context, PointF pointF, int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        m0 m0Var = new m0(context, f10);
        this.q0 = m0Var;
        m0Var.setMaxWidth(i10);
        r(i7, messageMedia, mediaArea);
        m0Var.e(0, this.s0);
        addView(m0Var, ha.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String n10 = a8.p0.n((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(n10);
        m10.append(floor2 <= 0.0d ? "0" : "");
        m10.append(floor2 < 10.0d ? "0" : "");
        String n11 = a8.p0.n((int) floor2, "'", m10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(n11);
        m11.append(floor3 <= 0.0d ? "0" : "");
        m11.append(floor3 < 10.0d ? "0" : "");
        return a8.p0.n((int) floor3, "\"", m11);
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // tg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ki0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // tg.j
    public float getStickyPaddingTop() {
        return this.q0.J;
    }

    public int getType() {
        return this.t0;
    }

    public int getTypesCount() {
        return this.q0.getTypesCount() - (!this.r0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public final void r(int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.u0 = messageMedia;
        this.v0 = mediaArea;
        String str2 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            sb2.append(d > 0.0d ? "N" : "S");
            sb2.append(" ");
            sb2.append(q(d2));
            sb2.append(d2 > 0.0d ? "E" : "W");
            str = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str2 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        m0 m0Var = this.q0;
        m0Var.d(i7, str2);
        m0Var.setText(str);
        m();
    }

    public void setColor(int i7) {
        this.r0 = true;
        this.s0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.q0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.t0 = i7;
        this.q0.e(i7, this.s0);
    }
}
