package w7;

import a8.b8;
import a8.la;
import a8.r7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDrmException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import androidx.emoji2.text.w;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import bi.v0;
import c8.t9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.l0;
import h9.i0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m9.v;
import m9.y;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.fr0;
import u2.x;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class s implements androidx.car.app.messaging.model.b, b7.e, com.google.android.gms.common.api.internal.r, eg.a, fg.a, qi, ja.a, SuccessContinuation, u9.d, gh.a, kb, l1, q2.q, r0.q, u2.k, y9.a, s0 {
    public static s b;
    public static final /* synthetic */ s c = new s(13);
    public static s d;
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i7) {
        this.a = i7;
    }

    public static MediaCodec V(b8 b8Var) {
        String str = ((u2.o) b8Var.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] a0(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                la.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(g2.b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a10);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Calendar b0() {
        if (d == null) {
            d = new s(27);
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
    public static boolean m0(t1.b bVar, Editable editable, int i7, int i10, boolean z10) {
        int min;
        if (editable != null && i7 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i7, 0);
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
                    selectionStart = Math.max(selectionStart - i7, 0);
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

    public static y s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((l0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                v vVar = new v();
                vVar.n(unsupportedOperationException);
                return vVar;
            }
        }
        return t9.b(list);
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // gh.a
    public int A2() {
        return 1711276032;
    }

    @Override // q2.q
    public byte[] C(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // q2.q
    public void D(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // u2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u2.l F(b8 b8Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = V(b8Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) b8Var.d;
            mediaCodec.configure((MediaFormat) b8Var.b, surface, (MediaCrypto) b8Var.e, (surface == null && ((u2.o) b8Var.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new x(mediaCodec, (u2.j) b8Var.f);
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

    @Override // q2.q
    public q2.o H(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // q2.q
    public int J() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // y9.a
    public void M(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // gh.a
    public /* synthetic */ int M0() {
        return 0;
    }

    @Override // eg.a
    public int M1(int i7, int i10, int i11) {
        return (i7 / i10) * i11;
    }

    @Override // q2.q
    public boolean O(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // eg.a
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i7, shortBuffer2.remaining() / i10);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            short s9 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i10 == 2) {
                shortBuffer2.put(s5);
                shortBuffer2.put(s9);
            } else if (i10 == 1) {
                shortBuffer2.put(qb.a.W4(s5, s9));
            }
        }
    }

    @Override // b7.e
    public b7.d Q(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        int o4 = cVar.o(context, str, true);
        dVar.b = o4;
        if (o4 != 0) {
            dVar.c = 1;
            return dVar;
        }
        int C = cVar.C(context, str);
        dVar.a = C;
        if (C != 0) {
            dVar.c = -1;
        }
        return dVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle R1(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(q1 q1Var, fj fjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean U(q1 q1Var) {
        return false;
    }

    @Override // gh.a
    public int U0() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // gh.a
    public int W1() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ float Y0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int Z() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ float Z0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a c0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // q2.q
    public Map d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var) {
        return false;
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        switch (this.a) {
            case 14:
                return new ob.c(r7Var.L(ob.b.class));
            default:
                return new ob.b(r7Var.c(nb.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 f(Class cls) {
        return new z1.b();
    }

    @Override // org.telegram.ui.Components.qi
    public void f0(eh ehVar) {
        ehVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 g(Class cls, y1.b bVar) {
        return f(cls);
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String i(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.kb
    public void j(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        r1.g gVar = new r1.g(lbVar, lb.IN_OUT_OFFSET_Y, lbVar.getHeight());
        gVar.m.a(0.8f);
        gVar.m.b(400.0f);
        gVar.a(new ya(uaVar, 1));
        gVar.b(new jb(xaVar, lbVar, 0));
        gVar.h();
        waVar.run();
    }

    @Override // com.google.android.gms.common.api.internal.r
    public Exception k(Status status) {
        return q6.m.m(status);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int k0(q1 q1Var) {
        return 0;
    }

    @Override // q2.q
    public q2.p n() {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean n0() {
        return false;
    }

    @Override // ja.a
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p0(x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // q2.q
    public k2.b r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // fg.a
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(i5.c.i(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = (int) Math.ceil((i10 / i7) * remaining);
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

    @Override // q2.q
    public byte[] t() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // gh.a
    public int t0() {
        return 872415231;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i7 = m6.c.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    @Override // org.telegram.ui.Components.kb
    public void u(lb lbVar, wa waVar, lg lgVar, pl plVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(lbVar.getTranslationY()));
        r1.g gVar = new r1.g((Object) lbVar, lb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.m.a(0.8f);
        gVar.m.b(400.0f);
        gVar.a(new v0(2, lbVar, lgVar));
        gVar.b(new jb(plVar, lbVar, 1));
        gVar.h();
        waVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // q2.q
    public void x(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y0(fj fjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 z2() {
        return null;
    }

    public s() {
        this.a = 12;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m() {
    }

    @Override // q2.q
    public void release() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // q2.q
    public void A(byte[] bArr) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R(fj fjVar) {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y(q1 q1Var) {
    }

    @Override // q2.q
    public void a(b5 b5Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(int i7) {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, boolean z10) {
    }

    @Override // q2.q
    public /* synthetic */ void G(byte[] bArr, m2.i iVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var, p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, i10 i10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void H0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // r0.q
    public void onScrollLimit(int i7, int i10, int i11, boolean z10) {
    }

    @Override // r0.q
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qi
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
