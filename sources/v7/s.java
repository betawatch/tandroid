package v7;

import android.content.Context;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import androidx.emoji2.text.w;
import b8.ke;
import c3.j0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d2.a2;
import e3.b0;
import e3.t;
import ii.z3;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Executors;
import k2.p1;
import org.json.JSONObject;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.zk;
import org.telegram.ui.vq0;
import t2.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class s implements j0, e3.g, fg.a, gg.a, ha.d, ia.a, t9.d, em0, Continuation, p5.b, eb, l1, q0, t2.k, w5.a, z3.g {
    public static s b;
    public static final /* synthetic */ s c = new s(13);
    public static s d;
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i3) {
        this.a = i3;
    }

    public static Calendar C0() {
        if (d == null) {
            d = new s(24);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean F0(s1.b bVar, Editable editable, int i3, int i10, boolean z10) {
        int min;
        if (editable != null && i3 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i3, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z11) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z11 = true;
                                    }
                                } else if (!z11) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i10, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i3, 0);
                    min = Math.min(selectionEnd + i10, editable.length());
                }
                w[] wVarArr = (w[]) editable.getSpans(selectionStart, min, w.class);
                if (wVarArr != null && wVarArr.length > 0) {
                    for (w wVar : wVarArr) {
                        int spanStart = editable.getSpanStart(wVar);
                        int spanEnd = editable.getSpanEnd(wVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static String M0(xc.c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public static void O0(String str) {
        if (str == null || str.length() == 0) {
            throw new qc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new qc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static MediaCodec w0(l2.e eVar) {
        String str = ((t2.o) eVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // ia.a
    public StackTraceElement[] A(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // z3.g
    public long D(e3.p pVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ d2 E() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.eb
    public void G(fb fbVar, qa qaVar, vf vfVar, zk zkVar) {
        fbVar.setInOutOffset(fbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(fbVar.getTranslationY()));
        q1.g gVar = new q1.g((Object) fbVar, fb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.m.a(0.8f);
        gVar.m.b(400.0f);
        gVar.a(new z3(1, fbVar, vfVar));
        gVar.b(new db(zkVar, fbVar, 1));
        gVar.h();
        qaVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override // fg.a
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    public boolean I0(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // t2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t2.l L(l2.e eVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = w0(eVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) eVar.d;
            mediaCodec.configure((MediaFormat) eVar.b, surface, (MediaCrypto) eVar.e, (surface == null && ((t2.o) eVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new x(mediaCodec, (t2.j) eVar.f);
        } catch (IOException e10) {
            e = e10;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // z3.g
    public b0 O() {
        return new t(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.eb
    public void e(fb fbVar, qa qaVar, oa oaVar, ra raVar) {
        q1.g gVar = new q1.g(fbVar, fb.IN_OUT_OFFSET_Y, fbVar.getHeight());
        gVar.m.a(0.8f);
        gVar.m.b(400.0f);
        gVar.a(new sa(oaVar, 1));
        gVar.b(new db(raVar, fbVar, 0));
        gVar.h();
        qaVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(q1 q1Var) {
        return null;
    }

    @Override // cd.a
    public Object get() {
        return new n5.p(Executors.newSingleThreadExecutor());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(q1 q1Var) {
        return 0;
    }

    @Override // ha.d
    public ha.b l(nb.a aVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        a7.l lVar = jSONObject.has("session") ? new a7.l(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new a7.l(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new ha.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), lVar, new ha.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // gg.a
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 < i10) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(p1.i(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = (int) Math.ceil((i10 / i3) * remaining);
        int i12 = remaining - ceil;
        float f10 = ceil;
        float f11 = f10 / f10;
        float f12 = i12;
        float f13 = f12 / f12;
        while (ceil > 0 && i12 > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f11 = ceil / f10;
            } else {
                shortBuffer.position(shortBuffer.position() + i11);
                i12--;
                f13 = i12 / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // w5.a
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        switch (this.a) {
            case 11:
                return new mb.d(keVar.f(mb.h.class));
            default:
                return new mb.k((Context) keVar.a(Context.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ i9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ boolean r0(t0 t0Var, float f10, float f11) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(zi ziVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
    }

    @Override // c3.j0
    public /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Components.em0
    public void finish() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
    }

    @Override // c3.j0
    public /* synthetic */ void i0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
    }

    @Override // c3.j0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void F(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(wi wiVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void W(long j10) {
    }

    @Override // org.telegram.ui.Components.em0
    public void Y(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void c0(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
    }

    @Override // c3.j0
    public /* synthetic */ void f(a2 a2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var) {
    }

    @Override // e3.g
    public long k(long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.em0
    public void m(float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void r(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void u(t0 t0Var) {
    }

    @Override // z3.g
    public void u0(long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void x(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void h(t0 t0Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void q0(t0 t0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void M(t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void g0(t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(q1 q1Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void t(t0 t0Var, int i3, int i10) {
    }

    @Override // fg.a
    public int v1(int i3, int i10, int i11) {
        return i3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void v0(t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
