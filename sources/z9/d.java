package z9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import cb.i;
import com.google.android.gms.tasks.OnFailureListener;
import d4.w;
import g5.o;
import g5.o0;
import h5.d0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kh.a2;
import o1.j;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.vu0;
import ra.m;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class d implements s0, OnFailureListener, w, c9.e, h3.a, kf.a, m6.c, of.a, mb, k1, p9.b, pf.a, q9.a, o0, m {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static p9.a G(db.a aVar) {
        return new p9.a(System.currentTimeMillis() + 3600000, new c5.c(8), new mb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short v3(short s6, short s9) {
        int i10 = s6 + 32768;
        int i11 = s9 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A2() {
        int i10 = this.a;
    }

    @Override // d4.w
    public int B() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // m6.c
    public int C(Context context, String str) {
        return m6.e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 C2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // d4.w
    public boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean D1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G1(t1 t1Var, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void H0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, jh.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // of.a
    public int N1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(t1 t1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.a) {
        }
        af.g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle R1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean T1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // of.a
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(v3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.a;
    }

    @Override // h3.a
    public long X() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(t1 t1Var, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ug.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // d4.w
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vu0 a2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // kf.a
    public boolean b(Context context) {
        return e0.b.j(context);
    }

    @Override // org.telegram.ui.Components.mb
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        j jVar = new j(nbVar, nb.IN_OUT_OFFSET_Y, nbVar.getHeight());
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new kb(xaVar, nbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 f(Class cls) {
        switch (this.a) {
            case 2:
                return new m0(true);
            default:
                return new w1.b();
        }
    }

    @Override // c9.e
    public Object f0(c5.j jVar) {
        switch (this.a) {
            case 6:
                return new fb.a();
            default:
                return new cb.d(jVar.d(i.class));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(int i10) {
        int i11 = this.a;
    }

    @Override // p9.b
    public p9.a h(db.a aVar, JSONObject jSONObject) {
        return G(aVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // d4.w
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, long j10) {
        int i10 = this.a;
    }

    @Override // kf.a
    public boolean l(Context context) {
        return e0.b.m(context);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // m6.c
    public int p(Context context, String str, boolean z4) {
        return m6.e.d(context, str, z4);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // g5.o0
    public Object r(Uri uri, o oVar) {
        return Long.valueOf(d0.J(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // ra.m
    public Object s2() {
        return new ConcurrentSkipListMap();
    }

    public Signature[] s3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // pf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(a2.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // org.telegram.ui.Components.mb
    public void v(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        j jVar = new j(nbVar, nb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new lb(0, nbVar, fgVar));
        jVar.b(new kb(glVar, nbVar, 1));
        jVar.f();
        waVar.run();
    }

    @Override // q9.a
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = i11;
            i13 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // androidx.lifecycle.s0
    public p0 x(Class cls, v1.b bVar) {
        switch (this.a) {
        }
        return f(cls);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean y2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // d4.w
    public boolean z(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.a;
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void H3() {
    }

    private final /* synthetic */ void K2() {
    }

    private final /* synthetic */ void L2() {
    }

    private final /* synthetic */ void Q1() {
    }

    private final /* synthetic */ void U1() {
    }

    private final /* synthetic */ void Y() {
    }

    private final /* synthetic */ void b0() {
    }

    private final /* synthetic */ void o0() {
    }

    private final /* synthetic */ void r0() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void u3() {
    }

    private final /* synthetic */ void y3() {
    }

    private final /* synthetic */ void z3() {
    }

    private final /* synthetic */ void A1(t1 t1Var) {
    }

    private final /* synthetic */ void A3(int i10) {
    }

    private final /* synthetic */ void B1(t1 t1Var) {
    }

    private final /* synthetic */ void B3(int i10) {
    }

    private final /* synthetic */ void D2(t1 t1Var) {
    }

    private final /* synthetic */ void E2(t1 t1Var) {
    }

    private final /* synthetic */ void E3(MessageObject messageObject) {
    }

    private final /* synthetic */ void F2(t1 t1Var) {
    }

    private final /* synthetic */ void F3(MessageObject messageObject) {
    }

    private final /* synthetic */ void G0(t1 t1Var) {
    }

    private final /* synthetic */ void I0(t1 t1Var) {
    }

    private final /* synthetic */ void I2(t1 t1Var) {
    }

    private final /* synthetic */ void J2(t1 t1Var) {
    }

    private final /* synthetic */ void S0(t1 t1Var) {
    }

    private final /* synthetic */ void S2(String str) {
    }

    private final /* synthetic */ void T2(String str) {
    }

    private final /* synthetic */ void V0(t1 t1Var) {
    }

    private final /* synthetic */ void X0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void Y2(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void b1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void c0(t1 t1Var) {
    }

    private final /* synthetic */ void c1(t1 t1Var) {
    }

    private final /* synthetic */ void c3(t1 t1Var) {
    }

    private final /* synthetic */ void d3(t1 t1Var) {
    }

    private final /* synthetic */ void e0(t1 t1Var) {
    }

    private final /* synthetic */ void e1(t1 t1Var) {
    }

    private final /* synthetic */ void e3(MessageObject messageObject) {
    }

    private final /* synthetic */ void f3(MessageObject messageObject) {
    }

    private final /* synthetic */ void g3(t1 t1Var) {
    }

    private final /* synthetic */ void h1(t1 t1Var) {
    }

    private final /* synthetic */ void h3(t1 t1Var) {
    }

    private final /* synthetic */ void i1(t1 t1Var) {
    }

    private final /* synthetic */ void j0(t1 t1Var) {
    }

    private final /* synthetic */ void k3(t1 t1Var) {
    }

    private final /* synthetic */ void l3(t1 t1Var) {
    }

    private final /* synthetic */ void m0(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void n2(t1 t1Var) {
    }

    private final /* synthetic */ void o2(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final /* synthetic */ void p1(t1 t1Var) {
    }

    private final /* synthetic */ void q3(t1 t1Var) {
    }

    private final /* synthetic */ void r3(t1 t1Var) {
    }

    private final /* synthetic */ void t0(t1 t1Var) {
    }

    private final /* synthetic */ void w0(t1 t1Var) {
    }

    private final /* synthetic */ void w2(t1 t1Var) {
    }

    private final /* synthetic */ void x2(t1 t1Var) {
    }

    private final /* synthetic */ void y1(t1 t1Var) {
    }

    private final /* synthetic */ void z1(t1 t1Var) {
    }

    private final /* synthetic */ void z2(t1 t1Var) {
    }

    private final /* synthetic */ void D0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void H1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void K(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void L1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void V(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void V2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void f1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void g1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void i3(t1 t1Var, jh.f fVar) {
    }

    private final /* synthetic */ void j3(t1 t1Var, jh.f fVar) {
    }

    private final /* synthetic */ void k1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void m1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void n3(t1 t1Var, boolean z4) {
    }

    private final /* synthetic */ void p3(t1 t1Var, boolean z4) {
    }

    private final /* synthetic */ void r2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void t1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void u1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void v1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void w1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void x0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void G2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void H(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void H2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void J(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void M2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void N0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void N2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void Q0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void W1(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void a3(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void b2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void b3(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void q1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void s1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void C1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void F1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void O2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void P2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void R2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void c2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void g2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void W2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void X2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void h2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void j2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void l2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void m2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void K0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void M0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void w3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void x3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
