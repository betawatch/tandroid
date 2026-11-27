// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tg0 implements fd, s84, t36, ncc, jcc, t69, nr7, yyc, dz7, zk0, s69, vka, uka, yma, gcb, WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback, h69, CameraView.CameraViewDelegate, hc1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                mq5 H0 = hl.H0(l2dVar, false);
                sr0 sr0Var = ((rr0) obj).d;
                int i = H0.a;
                int i2 = H0.b;
                int i3 = H0.c;
                int i4 = H0.d;
                Rect rect = sr0Var.x;
                if (rect.left != i || rect.top != i2 || rect.right != i3 || rect.bottom != i4) {
                    rect.set(i, i2, i3, i4);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sr0Var.n.getLayoutParams();
                    layoutParams.bottomMargin = rect.bottom;
                    layoutParams.leftMargin = rect.left;
                    layoutParams.rightMargin = rect.right;
                    sr0Var.requestLayout();
                    sr0Var.j();
                }
                break;
            case 15:
                gy0 gy0Var = (gy0) obj;
                gy0Var.s = l2dVar.a.f(2).d;
                gy0Var.invalidate();
                break;
            default:
                mq5 H02 = hl.H0(l2dVar, false);
                n11 n11Var = ((o11) obj).a;
                if (n11Var != null) {
                    n11Var.setPadding(H02.a, H02.b, H02.c, H02.d);
                }
                view.requestLayout();
                break;
        }
        return l2d.b;
    }

    @Override // dz7
    public final void a(fz7 fz7Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.b0;
        xea.B = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.z(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.e0();
        jn7.e().k(jn7.o0, fz7Var);
    }

    @Override // uka
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override // vka
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        d79 d79Var = (d79) recyclerView;
        uk0.a(d79Var, canvas, rectF, d79Var, (wka) this.b);
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        d61 d61Var = (d61) this.b;
        ArrayList arrayList = d61Var.c;
        byte b = 1;
        if (((c61) arrayList.get(i)).a != 1) {
            if (((c61) arrayList.get(i)).a == 2) {
                u51 u51Var = ((c61) arrayList.get(i)).c;
                ox5 ox5Var = new ox5(d61Var, view.getContext());
                ox5Var.h(false);
                ox5Var.setParentWindow(jj.N(d61Var, ox5Var, view, f, f2));
                ox5Var.setCallback(new a61(d61Var, u51Var, b));
                return;
            }
            if (((c61) arrayList.get(i)).a == 4) {
                id idVar = jj.L(d61Var.getParentActivity(), ob6.M0(2131747640, null), ob6.M0(2131747641, null), ob6.M0(2131751563, null), new fv0(d61Var, (byte) 11), null).a;
                idVar.show();
                idVar.h();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        int i2 = d61Var.e;
        if (i2 == 1) {
            bundle.putInt("dialogsType", 6);
        } else if (i2 == 2) {
            bundle.putInt("dialogsType", 5);
        } else {
            bundle.putInt("dialogsType", 4);
        }
        bundle.putBoolean("allowGlobalSearch", false);
        uj3 uj3Var = new uj3(bundle);
        uj3Var.E2 = new h01((Object) d61Var, (Object) uj3Var, (byte) 3);
        d61Var.presentFragment(uj3Var);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        bga bgaVar = ((gr0) this.b).a0;
        if (bgaVar.H.F1 || !(view instanceof jja)) {
            return false;
        }
        r47 messageObject = ((jja) view).getMessageObject();
        if (bgaVar.c(messageObject)) {
            bgaVar.g(messageObject);
            return true;
        }
        bgaVar.e(messageObject);
        return true;
    }

    @Override // h69
    public final void f() {
        ((vy4) this.b).g();
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        bga bgaVar = (bga) this.b;
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        new jr0(bgaVar.a, ob6.M0(2131746420, null), new te2(bgaVar, (byte) 8)).show();
        return Boolean.TRUE;
    }

    @Override // uka
    public final RecyclerView h(View view) {
        return ((l61) this.b).a(view);
    }

    @Override // yyc
    public final void i(WebView webView, rx rxVar, Uri uri, boolean z, cv5 cv5Var) {
        nv0 nv0Var = (nv0) this.b;
        rv0 rv0Var = nv0Var.R;
        if (webView != nv0Var || rv0Var == null) {
            return;
        }
        if (webView != rv0Var.a || rxVar.b) {
            rv0Var.e("onBotWebMessage ignored: invalid source or payload");
            return;
        }
        String i = rv0.i(uri == null ? null : uri.toString());
        if (rv0Var.u0 && (TextUtils.isEmpty(rv0Var.H0) || !TextUtils.equals(rv0Var.H0, i) || !TextUtils.equals(rv0Var.H0, rv0Var.getOriginHost()))) {
            rv0Var.e("onBotWebMessage ignored: untrusted origin");
            return;
        }
        pv0 d = rv0Var.d();
        try {
            rxVar.b(0);
            String str = (String) rxVar.c;
            if (str == null || str.length() > 1048576) {
                rv0Var.e("onBotWebMessage ignored: invalid payload length");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("eventType");
            if (string.isEmpty() || string.length() > 128) {
                rv0Var.e("onBotWebMessage ignored: invalid event type");
            } else {
                hl.c3(new la7((Object) rv0Var, (Object) webView, (Object) d, (Object) string, (Object) jSONObject.optString("eventData", null), (byte) 7));
            }
        } catch (JSONException e) {
            cc4.g(e, true);
        }
    }

    @Override // yma
    public final void j(int i) {
        xea.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i)).intValue()).apply();
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i;
        vnb vnbVar;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 8:
                ((vo0) obj3).Z((b8c) obj);
                break;
            default:
                zs0 zs0Var = (zs0) obj3;
                b8c b8cVar = (b8c) obj;
                at0 at0Var = zs0Var.r;
                if (!(b8cVar.H instanceof TL_stars.StarsTransaction)) {
                    if (zs0Var.h) {
                        zs0Var.h = false;
                        zs0Var.a();
                        break;
                    }
                } else {
                    Context context = zs0Var.getContext();
                    long j = at0Var.b;
                    i = ((e) at0Var).currentAccount;
                    TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) b8cVar.H;
                    vnbVar = ((e) at0Var).resourceProvider;
                    nza.l1(context, true, j, i, starsTransaction, vnbVar);
                    break;
                }
                break;
        }
    }

    @Override // gcb
    public final void l(Canvas canvas, RectF rectF, float f) {
        j81 j81Var = (j81) ((z8d) this.b).b;
        Paint paint = j81Var.x;
        TextPaint textPaint = j81Var.e;
        paint.setAlpha((int) (80.0f * f));
        float R1 = hl.R1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f);
        canvas.drawRoundRect(rectF, R1, R1, paint);
        float i = Utilities.i((f - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / hl.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(j81Var.i0 + 1), rectF.centerX(), rectF.centerY() + hl.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // zk0
    public final void n(Canvas canvas, int i) {
        ((z11) this.b).dispatchDrawImplBlur(canvas, i);
    }

    @Override // uka
    public final /* synthetic */ void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        la1 la1Var = (la1) this.b;
        HandlerThread handlerThread = la1Var.e;
        handlerThread.start();
        la1Var.f = new Handler(handlerThread.getLooper());
        hl.d3(la1Var.e0, 0L);
        if (la1Var.e0()) {
            vpa vpaVar = la1Var.E;
            if (vpaVar != null) {
                vpaVar.d();
                la1Var.E = null;
            }
            vpa vpaVar2 = new vpa(new xk4(0.0f));
            la1Var.E = vpaVar2;
            vpaVar2.b(new fa1(la1Var, (byte) 1));
            la1Var.E.a(new iw0(la1Var, (byte) 3));
            la1Var.E.m = new wpa(500.0f);
            la1Var.E.m.a(0.8f);
            la1Var.E.m.b(250.0f);
            la1Var.E.h();
        }
    }

    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        CallAudioDevice.lambda$setOnRecordedSamples$0((CallAudioDevice.SamplesCallback) this.b, audioSamples);
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((Switch) this.b).invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ug0 ug0Var = (ug0) obj;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    ug0Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                ((o2a) obj).run();
                break;
            case 4:
                ((o2a) obj).run();
                break;
            case 5:
                ((hv4) obj).run();
                break;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) obj;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    tv4.a1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 14:
                ((la7) obj).run();
                break;
            case 22:
                r61 r61Var = (r61) obj;
                q61 q61Var = new q61(b2, r61Var.getContext(), objArr2 == true ? 1 : 0);
                q61Var.J();
                q61Var.c0 = false;
                q61Var.setCancelable(false);
                Context context = r61Var.getContext();
                tt ttVar = new tt(context, (byte) 4);
                e29 e29Var = new e29(context);
                e29Var.setAutoRepeat(true);
                e29Var.f(R.raw.utyan_cache, jn7.f2, jn7.f2, null);
                ttVar.addView(e29Var, tre.d(jn7.f2, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                e29Var.d();
                in inVar = new in(context, false, true, true);
                ttVar.b = inVar;
                k43 k43Var = k43.g;
                inVar.b(0.35f, 120L, k43Var);
                inVar.setGravity(1);
                int i2 = aob.j5;
                yob.U(inVar, i2, null);
                inVar.setTextSize(hl.L(24.0f));
                inVar.setTypeface(hl.o());
                ttVar.addView(inVar, tre.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                s61 s61Var = new s61(context);
                Paint paint = new Paint(1);
                s61Var.a = paint;
                Paint paint2 = new Paint(1);
                s61Var.b = paint2;
                s61Var.d = new mm(350L, s61Var, k43Var);
                int i3 = aob.N6;
                paint.setColor(aob.w0(null, i3, false));
                paint2.setColor(aob.p1(0.2f, aob.w0(null, i3, false)));
                ttVar.c = s61Var;
                ttVar.addView(s61Var, tre.d(jn7.O3, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                qd4.w(textView, i2, null, 1, 16.0f);
                textView.setText(ob6.M0(2131752011, null));
                ttVar.addView(textView, tre.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                yob.X(textView2, i2, null);
                bs2.r(14.0f, 1, 2131752010, textView2, null);
                ttVar.addView(textView2, tre.d(jn7.O3, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                ttVar.e(0.0f);
                q61Var.O = ttVar;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                o97 o97Var = new o97(r61Var, ttVar, fArr, zArr2, (byte) 17);
                long[] jArr = {-1};
                hl.d3(new o97(r61Var, zArr, jArr, q61Var, (byte) 18), 150L);
                z61 z61Var = r61Var.d;
                p pVar = new p((Object) fArr, (Object) zArr2, (Object) o97Var, (byte) 5);
                p61 p61Var = new p61(zArr, ttVar, jArr, q61Var, (byte) 0);
                d71 d71Var = z61Var.e0;
                if (d71Var != null) {
                    d71Var.d();
                }
                l61 l61Var = z61Var.N;
                if (l61Var != null) {
                    l61Var.e();
                    z61Var.N.f(false);
                }
                z61Var.getFileLoader().c();
                z61Var.getFileLoader().getClass();
                xb4.K.c(new h61(z61Var, pVar, p61Var, objArr == true ? 1 : 0));
                z61Var.e0 = null;
                l61 l61Var2 = z61Var.N;
                if (l61Var2 != null) {
                    l61Var2.setCacheModel(null);
                    break;
                }
                break;
            default:
                rbb rbbVar = ((hbb) ((zb1) obj)).S1;
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.s(null, null, true);
                }
                vab vabVar = rbbVar.w1;
                if (vabVar != null) {
                    vabVar.n0();
                }
                hbb hbbVar = rbbVar.d1;
                if (hbbVar != null) {
                    hbbVar.setHasRoundVideo(false);
                }
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null) {
                    File file = c8bVar.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        c8bVar = rbbVar.L1;
                        c8bVar.o0 = null;
                    }
                    if (c8bVar.p0 != null) {
                        try {
                            new File(rbbVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        rbbVar.L1.p0 = null;
                        break;
                    }
                }
                break;
        }
    }

    @Override // yma
    public final void m() {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
