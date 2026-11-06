package sa;

import a8.ia;
import a8.r7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.emoji2.text.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h9.i0;
import hi.y3;
import j$.util.DesugarCollections;
import j2.u;
import java.io.ByteArrayOutputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.xf;
import org.telegram.ui.er0;
import org.telegram.ui.fx;
import pb.l;
import s2.m;
import s2.s;
import s2.t;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d implements SuccessContinuation, androidx.car.app.messaging.model.b, b7.e, q, eg.a, fg.a, j2.g, gh.a, p, u9.d, q5.b, fb, l1, q0, OnFailureListener, t, u4.c {
    public static d b;
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    public static byte[] w0(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ia.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
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

    @Override // gh.a
    public int A() {
        return 872415231;
    }

    @Override // org.telegram.ui.Components.fb
    public void B(gb gbVar, ra raVar, xf xfVar, bl blVar) {
        gbVar.setInOutOffset(gbVar.getMeasuredHeight());
        blVar.accept(Float.valueOf(gbVar.getTranslationY()));
        r1.g gVar = new r1.g((Object) gbVar, gb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.m.a(0.8f);
        gVar.m.b(400.0f);
        gVar.a(new y3(1, gbVar, xfVar));
        gVar.b(new eb(blVar, gbVar, 1));
        gVar.h();
        raVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // gh.a
    public /* synthetic */ int C0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    @Override // eg.a
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
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
                shortBuffer2.put(pb.b.d1(s5, s9));
            }
        }
    }

    @Override // s2.t
    public b3.q I(s2.p pVar, m mVar) {
        return new s(pVar, mVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // u4.c
    public void L() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // gh.a
    public /* synthetic */ int M() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ er0 N1() {
        return null;
    }

    @Override // gh.a
    public int O() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // gh.a
    public int R0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // s2.t
    public b3.q Y() {
        return new s(s2.p.n, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        m7.d dVar = (m7.d) ((m7.e) obj).n();
        e7.b bVar = new e7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i7 = m7.c.a;
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

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public void c(gb gbVar, ra raVar, pa paVar, sa saVar) {
        r1.g gVar = new r1.g(gbVar, gb.IN_OUT_OFFSET_Y, gbVar.getHeight());
        gVar.m.a(0.8f);
        gVar.m.b(400.0f);
        gVar.a(new ta(paVar, 1));
        gVar.b(new eb(saVar, gbVar, 0));
        gVar.h();
        raVar.run();
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new u(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean d() {
        return false;
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        pb.a aVar = new pb.a();
        n nVar = new n(9);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new l(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new fx(referenceQueue, set, false, 1), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // gh.a
    public int e1() {
        return 1711276032;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public Exception f(Status status) {
        return q6.m.l(status);
    }

    @Override // b7.e
    public b7.d f0(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        int m10 = cVar.m(context, str, true);
        dVar.b = m10;
        if (m10 != 0) {
            dVar.c = 1;
            return dVar;
        }
        int q10 = cVar.q(context, str);
        dVar.a = q10;
        if (q10 != 0) {
            dVar.c = -1;
        }
        return dVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 16:
                return new o5.p(Executors.newSingleThreadExecutor());
            default:
                nb.a aVar = new nb.a(28);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(l5.d.a, new u5.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(l5.d.c, new u5.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(u5.c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(l5.d.b, new u5.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < l5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new u5.a(aVar, hashMap);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(q1 q1Var) {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ float j0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 k2() {
        return null;
    }

    @Override // u4.c
    public void l0(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(r5 r5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // gh.a
    public /* synthetic */ float o0() {
        return -1.0f;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override // fg.a
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(jg.g.j(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
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

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ boolean r0(t0 t0Var, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ f2 t() {
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // gh.a
    public /* synthetic */ float v0() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String y(long j3) {
        return null;
    }

    @Override // eg.a
    public int z1(int i7, int i10, int i11) {
        return (i7 / i10) * i11;
    }

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void E(long j3) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void F(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void l(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void q(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void s(t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void c0(t0 t0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void i(t0 t0Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void D(t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void W(t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void m(t0 t0Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.q0
    public /* synthetic */ void t0(t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
