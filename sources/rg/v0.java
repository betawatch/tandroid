package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hk0;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v0 extends k {
    public final u0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public TLRPC.MessageMedia u0;
    public TL_stories.MediaArea v0;

    public v0(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f7, int i11) {
        super(context, pointF);
        u0 u0Var = new u0(context, f7);
        this.q0 = u0Var;
        u0Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        u0Var.e(0, this.s0);
        addView(u0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String n10 = a4.a.n((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder u10 = a4.a.u(n10);
        u10.append(floor2 <= 0.0d ? "0" : "");
        u10.append(floor2 < 10.0d ? "0" : "");
        String n11 = a4.a.n((int) floor2, "'", u10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder u11 = a4.a.u(n11);
        u11.append(floor3 <= 0.0d ? "0" : "");
        u11.append(floor3 < 10.0d ? "0" : "");
        return a4.a.n((int) floor3, "\"", u11);
    }

    @Override // rg.k
    public final j a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // rg.k
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // rg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = wl.u(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(u10, wl.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override // rg.k
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // rg.k
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // rg.k
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // rg.k
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void r(int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.u0 = messageMedia;
        this.v0 = mediaArea;
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
        u0 u0Var = this.q0;
        u0Var.d(i10, str2);
        u0Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.r0 = true;
        this.s0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.t0 = i10;
        this.q0.e(i10, this.s0);
    }
}
