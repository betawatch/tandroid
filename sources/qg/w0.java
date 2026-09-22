package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hk0;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w0 extends j {
    public final v0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public TLRPC.MessageMedia u0;
    public TL_stories.MediaArea v0;

    public w0(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f7, int i11) {
        super(context, pointF);
        v0 v0Var = new v0(context, f7);
        this.q0 = v0Var;
        v0Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        v0Var.e(0, this.s0);
        addView(v0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String o9 = a4.a.o((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder v = a4.a.v(o9);
        v.append(floor2 <= 0.0d ? "0" : "");
        v.append(floor2 < 10.0d ? "0" : "");
        String o10 = a4.a.o((int) floor2, "'", v);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder v9 = a4.a.v(o10);
        v9.append(floor3 <= 0.0d ? "0" : "");
        v9.append(floor3 < 10.0d ? "0" : "");
        return a4.a.o((int) floor3, "\"", v9);
    }

    @Override // qg.j
    public final i a() {
        return new s0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // qg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // qg.j
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = vl.v(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(v, vl.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override // qg.j
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // qg.j
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // qg.j
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // qg.j
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
        v0 v0Var = this.q0;
        v0Var.d(i10, str2);
        v0Var.setText(str);
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
