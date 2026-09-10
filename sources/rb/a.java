package rb;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import b2.s;
import b2.s0;
import b4.i;
import bi.u6;
import c3.g;
import c5.b0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import f4.e;
import fb.n;
import g2.j;
import g2.u;
import g2.x;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import n4.y;
import nf.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import pb.b;
import pb.c;
import q9.d;
import r2.k;
import r2.l;
import r2.o;
import y2.m;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements ag.a, g, ea.a, n, ch.a, d, k1, OnFailureListener, k, u5.a, Continuation, wf.a, z3.k {
    public static volatile a b;
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static MediaCodec B(com.google.firebase.messaging.n nVar) {
        String str = ((o) nVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static k4.d n3(y2.g gVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.c;
        if (!(iOException instanceof x)) {
            return null;
        }
        int i10 = ((x) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (gVar.a(1)) {
            return new k4.d(1, 300000L);
        }
        if (gVar.a(2)) {
            return new k4.d(2, 60000L);
        }
        return null;
    }

    public static long p3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.c;
        if ((th2 instanceof s0) || (th2 instanceof FileNotFoundException) || (th2 instanceof u) || (th2 instanceof m)) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // z3.k
    public boolean C(s sVar) {
        String str = sVar.r;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void E0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // ag.a
    public int J1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle M1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        switch (this.a) {
            case 14:
                return new c(u6Var.x(b.class));
            default:
                return new b(u6Var.c(ob.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // ag.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(ob.a.B2(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, ai.j jVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int U() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ gh.a X() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ rv0 X1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // wf.a
    public boolean a(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l c(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = B(nVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) nVar.d;
            mediaCodec.configure((MediaFormat) nVar.b, surface, (MediaCrypto) nVar.e, (surface == null && ((o) nVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new r2.x(mediaCodec, (r2.j) nVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // z3.k
    public z3.m d(s sVar) {
        String str = sVar.r;
        List list = sVar.u;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new i(list);
                case "application/pgs":
                    return new com.google.firebase.messaging.s(2);
                case "application/x-mp4-vtt":
                    return new a6.i(25);
                case "text/vtt":
                    return new y(22);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new com.google.firebase.messaging.s(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new e();
            }
        }
        throw new IllegalArgumentException(r6.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(MessageObject messageObject) {
        int i10 = this.a;
        return em.a(messageObject);
    }

    @Override // ch.a
    public int h() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // z3.k
    public int k(s sVar) {
        String str = sVar.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(r6.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var) {
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

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
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
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object n2() {
        switch (this.a) {
            case 8:
                return new ArrayList();
            default:
                return new fb.m(true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(y5 y5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
        int i10 = this.a;
    }

    public int o3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // ch.a
    public int p() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean t2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // u5.a
    public long u() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2() {
        int i10 = this.a;
    }

    @Override // ch.a
    public int w() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // ch.a
    public int x() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ t9 x2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // wf.a
    public boolean y(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    public a(Context context) {
        this.a = 11;
    }

    private final /* synthetic */ void A1() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void D1() {
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void F2() {
    }

    private final /* synthetic */ void G2() {
    }

    private final /* synthetic */ void T() {
    }

    private final /* synthetic */ void V() {
    }

    private final /* synthetic */ void g0() {
    }

    private final /* synthetic */ void j0() {
    }

    private final /* synthetic */ void q3() {
    }

    private final /* synthetic */ void r3() {
    }

    private final /* synthetic */ void u3() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void y3() {
    }

    private final /* synthetic */ void z3() {
    }

    private final /* synthetic */ void A2(t1 t1Var) {
    }

    private final /* synthetic */ void A3(MessageObject messageObject) {
    }

    private final /* synthetic */ void B3(MessageObject messageObject) {
    }

    private final /* synthetic */ void D2(t1 t1Var) {
    }

    private final /* synthetic */ void E2(t1 t1Var) {
    }

    private final /* synthetic */ void H0(t1 t1Var) {
    }

    private final /* synthetic */ void J0(t1 t1Var) {
    }

    private final /* synthetic */ void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void N2(String str) {
    }

    private final /* synthetic */ void O0(t1 t1Var) {
    }

    private final /* synthetic */ void O2(String str) {
    }

    private final /* synthetic */ void Q0(t1 t1Var) {
    }

    private final /* synthetic */ void T2(t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void W(t1 t1Var) {
    }

    private final /* synthetic */ void X2(t1 t1Var) {
    }

    private final /* synthetic */ void Y0(t1 t1Var) {
    }

    private final /* synthetic */ void Y2(t1 t1Var) {
    }

    private final /* synthetic */ void Z(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(MessageObject messageObject) {
    }

    private final /* synthetic */ void a0(t1 t1Var) {
    }

    private final /* synthetic */ void a1(t1 t1Var) {
    }

    private final /* synthetic */ void a3(MessageObject messageObject) {
    }

    private final /* synthetic */ void b3(t1 t1Var) {
    }

    private final /* synthetic */ void c3(t1 t1Var) {
    }

    private final /* synthetic */ void e0(t1 t1Var) {
    }

    private final /* synthetic */ void e1(t1 t1Var) {
    }

    private final /* synthetic */ void f1(t1 t1Var) {
    }

    private final /* synthetic */ void f3(t1 t1Var) {
    }

    private final /* synthetic */ void g3(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final /* synthetic */ void i2(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final /* synthetic */ void k0(t1 t1Var) {
    }

    private final /* synthetic */ void l2(t1 t1Var) {
    }

    private final /* synthetic */ void l3(t1 t1Var) {
    }

    private final /* synthetic */ void m0(t1 t1Var) {
    }

    private final /* synthetic */ void m3(t1 t1Var) {
    }

    private final /* synthetic */ void q1(t1 t1Var) {
    }

    private final /* synthetic */ void q2(t1 t1Var) {
    }

    private final /* synthetic */ void r1(t1 t1Var) {
    }

    private final /* synthetic */ void s0(t1 t1Var) {
    }

    private final /* synthetic */ void s1(t1 t1Var) {
    }

    private final /* synthetic */ void s2(t1 t1Var) {
    }

    private final /* synthetic */ void t0(t1 t1Var) {
    }

    private final /* synthetic */ void u1(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void w3(int i10) {
    }

    private final /* synthetic */ void x3(int i10) {
    }

    private final /* synthetic */ void y2(t1 t1Var) {
    }

    private final /* synthetic */ void z2(t1 t1Var) {
    }

    @Override // c3.g
    public long b(long j3) {
        return j3;
    }

    private final /* synthetic */ void I(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void J(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void P2(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void T0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void U0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void b1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d3(t1 t1Var, ai.j jVar) {
    }

    private final /* synthetic */ void e3(t1 t1Var, ai.j jVar) {
    }

    private final /* synthetic */ void i3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void k1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void k3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void m1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void m2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void n1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void p1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void p2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void r0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void x1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void y1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void B2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void C2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void F(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void G(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void R1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void V2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void W2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void h1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void i1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void K2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void L2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void M2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void W1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void b2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void v1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void w1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void R2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void S2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void d2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void f2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void g2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void h2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void v0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void y0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void s3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
