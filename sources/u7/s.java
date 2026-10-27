package u7;

import a8.me;
import aa.m0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDrmException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.view.Surface;
import androidx.emoji2.text.v;
import androidx.fragment.app.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x0;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.z;
import g2.u;
import g2.x;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import li.e3;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.d3;
import org.telegram.ui.ev0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class s implements s0, c3.g, j5.e, dg.a, eg.a, ga.a, hb.n, com.google.android.gms.common.api.internal.r, fh.a, n2.q, o6.k, j1, s9.d, r2.k, o5.b, v5.a, z6.d {
    public static s b;
    public static s c;
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i10) {
        this.a = i10;
    }

    public static long H0(z zVar) {
        for (Throwable th2 = (IOException) zVar.c; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof u) || (th2 instanceof y2.k)) {
                return -9223372036854775807L;
            }
            if ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((zVar.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
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
    public static boolean N0(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int min;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i10, 0);
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
                    int max2 = Math.max(i11, 0);
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
                    selectionStart = Math.max(selectionStart - i10, 0);
                    min = Math.min(selectionEnd + i11, editable.length());
                }
                v[] vVarArr = (v[]) editable.getSpans(selectionStart, min, v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
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

    public static MediaCodec x0(m0 m0Var) {
        String str = ((r2.o) m0Var.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static k4.d z0(vi.z zVar, z zVar2) {
        IOException iOException = (IOException) zVar2.c;
        if (!(iOException instanceof x)) {
            return null;
        }
        int i10 = ((x) iOException).c;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (zVar.a(1)) {
            return new k4.d(1, 300000L);
        }
        if (zVar.a(2)) {
            return new k4.d(2, 60000L);
        }
        return null;
    }

    @Override // fh.a
    public int A() {
        return 352321535;
    }

    @Override // androidx.lifecycle.s0
    public p0 B(Class cls, v1.b bVar) {
        switch (this.a) {
        }
        return a(cls);
    }

    public int B0(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // n2.q
    public void E(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ev0 E1() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2.l G(m0 m0Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = x0(m0Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) m0Var.d;
            mediaCodec.configure((MediaFormat) m0Var.b, surface, (MediaCrypto) m0Var.e, (surface == null && ((r2.o) m0Var.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new r2.x(mediaCodec, (r2.j) m0Var.f);
        } catch (IOException e) {
            e = e;
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

    @Override // dg.a
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? dg.a.p : i10 > i11 ? dg.a.l : i10 < i11 ? dg.a.m : dg.a.o).G0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean G1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean I1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M() {
        return false;
    }

    public Signature[] M0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean N(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O0(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // n2.q
    public byte[] R(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int S() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override // n2.q
    public void U(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // hb.n
    public Object U1() {
        switch (this.a) {
            case 9:
                return new ArrayList();
            default:
                return new hb.m(true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ jh.a V() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X1(int i10) {
        return false;
    }

    @Override // n2.q
    public n2.o Y(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) {
        switch (this.a) {
            case 2:
                return new l0(true);
            default:
                return new w1.b();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        k7.d dVar = (k7.d) ((k7.e) obj).u();
        c7.b bVar = new c7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = k7.c.a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // j5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // n2.q
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ t9 b2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int c0(s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // s9.d
    public Object d1(me meVar) {
        switch (this.a) {
            case 18:
                return new sb.d(meVar.d(sb.h.class));
            default:
                return new sb.k((Context) meVar.a(Context.class));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e0() {
        return false;
    }

    @Override // o6.k
    public /* bridge */ /* synthetic */ Object f(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // fh.a
    public int f0() {
        return 0;
    }

    @Override // id.a
    public Object get() {
        pa.d dVar = new pa.d();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(j5.d.a, new s5.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(j5.d.c, new s5.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(s5.c.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(j5.d.b, new s5.b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < j5.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new s5.a(dVar, hashMap);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h0(c6 c6Var) {
        return false;
    }

    @Override // n2.q
    public int i0() {
        return 1;
    }

    @Override // n2.q
    public n2.p k() {
        throw new IllegalStateException();
    }

    @Override // eg.a
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(ic.a.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f7 = remaining;
        float f10 = f7 / f7;
        float f11 = ceil;
        float f12 = f11 / f11;
        while (remaining > 0 && ceil > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f10 = remaining / f7;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f12 = ceil / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k1() {
        return false;
    }

    @Override // z6.d
    public a3.l l0(Context context, String str, z6.c cVar) {
        a3.l lVar = new a3.l();
        int t10 = cVar.t(context, str, true);
        lVar.b = t10;
        if (t10 != 0) {
            lVar.c = 1;
            return lVar;
        }
        int U = cVar.U(context, str);
        lVar.a = U;
        if (U != 0) {
            lVar.c = -1;
        }
        return lVar;
    }

    @Override // v5.a
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override // n2.q
    public boolean p0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean p1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // fh.a
    public int t() {
        return 872415231;
    }

    @Override // dg.a
    public int t1(int i10, int i11, int i12) {
        return (i11 == 6 ? dg.a.p : i11 > i12 ? dg.a.l : i11 < i12 ? dg.a.m : dg.a.o).t1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String u(long j10) {
        return null;
    }

    @Override // fh.a
    public int v0() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.j1
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override // ga.a
    public StackTraceElement[] w(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle w1(s1 s1Var) {
        return null;
    }

    @Override // n2.q
    public h2.b y(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean y1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // n2.q
    public byte[] z() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // n2.q
    public void release() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // n2.q
    public void H(byte[] bArr) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var) {
    }

    @Override // n2.q
    public void T(e3 e3Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d0(s1 s1Var) {
    }

    @Override // c3.g
    public long g(long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M1(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z0(s1 s1Var, TLRPC.Document document) {
    }

    @Override // n2.q
    public /* synthetic */ void e(byte[] bArr, j2.j jVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n0(s1 s1Var, bh.n nVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b0(s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f1(s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j0(s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void l1(s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u0(s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void y0(s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o0(s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
