package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n0 extends j {
    public final m0 r0;
    public boolean s0;
    public int t0;
    public int u0;
    public TLRPC.MessageMedia v0;
    public TL_stories.MediaArea w0;

    public n0(Context context, PointF pointF, int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        m0 m0Var = new m0(context, f10);
        this.r0 = m0Var;
        m0Var.setMaxWidth(i10);
        r(i7, messageMedia, mediaArea);
        m0Var.e(0, this.t0);
        addView(m0Var, ma.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String n10 = a8.p0.n((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(n10);
        m10.append(floor2 <= 0.0d ? "0" : "");
        m10.append(floor2 < 10.0d ? "0" : "");
        String n11 = a8.p0.n((int) floor2, "'", m10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(n11);
        m11.append(floor3 <= 0.0d ? "0" : "");
        m11.append(floor3 < 10.0d ? "0" : "");
        return a8.p0.n((int) floor3, "\"", m11);
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.t0;
    }

    @Override // tg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // tg.j
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yi0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        return new yi0(y10, n10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        return this.r0.K;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        return this.r0.J;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        return this.r0.J;
    }

    @Override // tg.j
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public final void r(int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.v0 = messageMedia;
        this.w0 = mediaArea;
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
        m0 m0Var = this.r0;
        m0Var.d(i7, str2);
        m0Var.setText(str);
        m();
    }

    public void setColor(int i7) {
        this.s0 = true;
        this.t0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.u0 = i7;
        this.r0.e(i7, this.t0);
    }
}
