package rb;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import androidx.car.app.messaging.model.b;
import b2.s0;
import c5.b0;
import ci.u5;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnFailureListener;
import fb.n;
import g2.j;
import g2.u;
import i5.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import ki.x;
import of.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.qv0;
import q9.d;
import r2.l;
import r2.m;
import r2.p;
import r2.y;
import uc.c;
import y2.i;
import y2.k;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a implements b, bg.a, e, cg.a, ea.a, n, dh.a, d, l1, OnFailureListener, l, v2.l, i {
    public static volatile a b;
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static void A3(String str) {
        if (str == null || str.length() == 0) {
            throw new c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static k4.d l3(x xVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.c;
        if (!(iOException instanceof g2.x)) {
            return null;
        }
        int i10 = ((g2.x) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (xVar.b(1)) {
            return new k4.d(1, 300000L);
        }
        if (xVar.b(2)) {
            return new k4.d(2, 60000L);
        }
        return null;
    }

    public static long n3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.c;
        if ((th2 instanceof s0) || (th2 instanceof FileNotFoundException) || (th2 instanceof u) || (th2 instanceof k)) {
            return -9223372036854775807L;
        }
        int i10 = j.b;
        while (th2 != null) {
            if ((th2 instanceof j) && ((j) th2).a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((b0Var.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    public static MediaCodec y(com.google.firebase.messaging.n nVar) {
        String str = ((p) nVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean D0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 E2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void J0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // bg.a
    public int R1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle U1(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // bg.a
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // y2.i
    public void a() {
        synchronized (z2.b.a) {
            Object obj = z2.b.b;
            synchronized (obj) {
                if (z2.b.c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.c = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // r2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m b(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = y(nVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) nVar.d;
            mediaCodec.configure((MediaFormat) nVar.b, surface, (MediaCrypto) nVar.e, (surface == null && ((p) nVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new y(mediaCodec, (r2.k) nVar.f);
        } catch (IOException e7) {
            e = e7;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e10) {
            e = e10;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // v2.l
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(u1 u1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // dh.a
    public int d() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(u1 u1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qv0 e2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // v2.l
    public long h() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i1(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // ea.a
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int l0(u1 u1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // dh.a
    public int m() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var, long j3) {
        int i10 = this.a;
    }

    public int m3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1(MessageObject messageObject) {
        int i10 = this.a;
        return c1.a(messageObject);
    }

    @Override // v2.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // dh.a
    public int q() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean t0(b6 b6Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object v2() {
        switch (this.a) {
            case 8:
                return new ArrayList();
            default:
                return new fb.m(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w2() {
        int i10 = this.a;
    }

    @Override // dh.a
    public int x() {
        return 1711276032;
    }

    @Override // cg.a
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // q9.d
    public Object y0(u5 u5Var) {
        switch (this.a) {
            case 14:
                return new pb.c(u5Var.y(pb.b.class));
            default:
                return new pb.b(u5Var.c(ob.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    public a() {
        this.a = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    private final /* synthetic */ void B2() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void H() {
    }

    private final /* synthetic */ void J() {
    }

    private final /* synthetic */ void Z() {
    }

    private final /* synthetic */ void a0() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void y1() {
    }

    private final /* synthetic */ void z1() {
    }

    private final /* synthetic */ void z2() {
    }

    @Override // y2.i
    public void v() {
    }

    private final /* synthetic */ void B0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void I0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void K(u1 u1Var) {
    }

    private final /* synthetic */ void K0(u1 u1Var) {
    }

    private final /* synthetic */ void L2(String str) {
    }

    private final /* synthetic */ void M0(u1 u1Var) {
    }

    private final /* synthetic */ void M2(String str) {
    }

    private final /* synthetic */ void P(u1 u1Var) {
    }

    private final /* synthetic */ void P1(u1 u1Var) {
    }

    private final /* synthetic */ void Q0(u1 u1Var) {
    }

    private final /* synthetic */ void R2(u1 u1Var) {
    }

    private final /* synthetic */ void S2(u1 u1Var) {
    }

    private final /* synthetic */ void T0(u1 u1Var) {
    }

    private final /* synthetic */ void V(u1 u1Var) {
    }

    private final /* synthetic */ void V2(u1 u1Var) {
    }

    private final /* synthetic */ void W2(u1 u1Var) {
    }

    private final /* synthetic */ void X(u1 u1Var) {
    }

    private final /* synthetic */ void X2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Y1(u1 u1Var) {
    }

    private final /* synthetic */ void Y2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Z0(u1 u1Var) {
    }

    private final /* synthetic */ void Z2(u1 u1Var) {
    }

    private final /* synthetic */ void a1(u1 u1Var) {
    }

    private final /* synthetic */ void a3(u1 u1Var) {
    }

    private final /* synthetic */ void c0(u1 u1Var) {
    }

    private final /* synthetic */ void d0(u1 u1Var) {
    }

    private final /* synthetic */ void d3(u1 u1Var) {
    }

    private final /* synthetic */ void e3(u1 u1Var) {
    }

    private final /* synthetic */ void f2(u1 u1Var) {
    }

    private final void f3(u1 u1Var) {
    }

    private final void h3(u1 u1Var) {
    }

    private final /* synthetic */ void j2(u1 u1Var) {
    }

    private final /* synthetic */ void j3(u1 u1Var) {
    }

    private final /* synthetic */ void k0(u1 u1Var) {
    }

    private final /* synthetic */ void k3(u1 u1Var) {
    }

    private final /* synthetic */ void l2(u1 u1Var) {
    }

    private final /* synthetic */ void m1(u1 u1Var) {
    }

    private final /* synthetic */ void n0(u1 u1Var) {
    }

    private final /* synthetic */ void n2(u1 u1Var) {
    }

    private final /* synthetic */ void o1(u1 u1Var) {
    }

    private final /* synthetic */ void o2(u1 u1Var) {
    }

    private final /* synthetic */ void p1(u1 u1Var) {
    }

    private final /* synthetic */ void p2(u1 u1Var) {
    }

    private final /* synthetic */ void r1(u1 u1Var) {
    }

    private final /* synthetic */ void u2(u1 u1Var) {
    }

    private final /* synthetic */ void u3(int i10) {
    }

    private final /* synthetic */ void v3(int i10) {
    }

    private final /* synthetic */ void w0(u1 u1Var) {
    }

    private final /* synthetic */ void x2(u1 u1Var) {
    }

    private final /* synthetic */ void y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void z0(u1 u1Var) {
    }

    private final /* synthetic */ void z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void D(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void F(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void N2(u1 u1Var, long j3) {
    }

    private final /* synthetic */ void O0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void O2(u1 u1Var, long j3) {
    }

    private final /* synthetic */ void P0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void U0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void b3(u1 u1Var, bi.f fVar) {
    }

    private final /* synthetic */ void c2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void c3(u1 u1Var, bi.f fVar) {
    }

    private final /* synthetic */ void d2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void f0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void g3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void h1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void i0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void i3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void j1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void k1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void l1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void w1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void x1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void B1(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void C(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void C1(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void G2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void T2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void U2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void g1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void q2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void s0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void t2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void u0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void z(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void D1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void E1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void H2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void I2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void J2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void K2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void t1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void u1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void F1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void G1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void I1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void L1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void P2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void Q2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void o0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void q0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
