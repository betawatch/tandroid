package z9;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Parcel;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.emoji2.text.v;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.i;
import d4.j;
import d4.k;
import d4.z;
import dg.u3;
import g5.b0;
import g5.e0;
import g5.g0;
import g5.j0;
import g5.l0;
import g5.n;
import g5.o0;
import j$.util.concurrent.ConcurrentHashMap;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import l7.w0;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;
import p2.w;
import r0.s;
import ra.m;
import u4.l;
import u4.o;
import u4.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements OnFailureListener, j, Continuation, j0, m6.d, nf.a, of.a, io0, j1, s, m, p, com.google.android.gms.common.api.internal.s, c9.f {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static MediaCodec c(i iVar) {
        iVar.a.getClass();
        String str = iVar.a.a;
        h5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        h5.a.q();
        return createByCodecName;
    }

    public static c4.e d(g0 g0Var, w wVar) {
        IOException iOException = (IOException) wVar.c;
        if (!(iOException instanceof e0)) {
            return null;
        }
        int i10 = ((e0) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (g0Var.a(1)) {
            return new c4.e(1, 300000L);
        }
        if (g0Var.a(2)) {
            return new c4.e(2, 60000L);
        }
        return null;
    }

    public static long v(w wVar) {
        Throwable th2 = (IOException) wVar.c;
        if ((th2 instanceof r1) || (th2 instanceof FileNotFoundException) || (th2 instanceof b0) || (th2 instanceof l0)) {
            return -9223372036854775807L;
        }
        int i10 = n.b;
        while (th2 != null) {
            if ((th2 instanceof n) && ((n) th2).a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((wVar.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
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
    public static boolean x(q1.b bVar, Editable editable, int i10, int i11, boolean z4) {
        int min;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z4) {
                    int max = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z10) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z10 = true;
                                    }
                                } else if (!z10) {
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
                            boolean z11 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z11) {
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
                                        z11 = true;
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // nf.a
    public int P1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // d4.j
    public k V(i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c(iVar);
            h5.a.c("configureCodec");
            mediaCodec.configure(iVar.b, iVar.d, iVar.e, 0);
            h5.a.q();
            h5.a.c("startCodec");
            mediaCodec.start();
            h5.a.q();
            return new z(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // nf.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            short s9 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s6);
                shortBuffer2.put(s9);
            } else if (i11 == 1) {
                shortBuffer2.put(db.a.I3(s6, s9));
            }
        }
    }

    @Override // org.telegram.ui.Components.io0
    public void Y(float f10, boolean z4) {
        u3.b = f10 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // g5.j0
    public void a() {
        synchronized (h5.a.h) {
            Object obj = h5.a.i;
            synchronized (obj) {
                if (h5.a.j) {
                    return;
                }
                long a2 = h5.a.a();
                synchronized (obj) {
                    h5.a.k = a2;
                    h5.a.j = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        x6.d dVar = (x6.d) ((x6.e) obj).u();
        p6.b bVar = new p6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = x6.c.a;
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        return null;
    }

    @Override // c9.f
    public Object d0(c5.j jVar) {
        cb.a aVar = new cb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(1);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new cb.n(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new androidx.biometric.j(referenceQueue, set, false, 1), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.io0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // m6.d
    public e8.a h(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        int h = cVar.h(context, str, true);
        aVar.b = h;
        if (h != 0) {
            aVar.c = 1;
            return aVar;
        }
        int z4 = cVar.z(context, str);
        aVar.a = z4;
        if (z4 != 0) {
            aVar.c = -1;
        }
        return aVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.io0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // u4.p
    public o0 k(l lVar, u4.i iVar) {
        return new o(lVar, iVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(s1 s1Var) {
        return 0;
    }

    @Override // u4.p
    public o0 l() {
        return new o(l.n, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    public int p(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // of.a
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(u5 u5Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 5:
                if (!task.isSuccessful()) {
                    Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                    break;
                }
                break;
        }
        return null;
    }

    @Override // ra.m
    public Object u2() {
        switch (this.a) {
            case 21:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        return false;
    }

    public /* synthetic */ d(x6.a aVar) {
        this.a = 24;
    }

    public d(Context context, r3.i iVar) {
        this.a = 14;
        f7.b bVar = new f7.b(context, 4);
        w0 w0Var = new w0(iVar, 16);
        if (bVar != ((f7.b) w0Var.d)) {
            w0Var.d = bVar;
            ((HashMap) w0Var.b).clear();
            ((HashMap) w0Var.c).clear();
        }
    }

    @Override // org.telegram.ui.Components.io0
    public void B() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // g5.j0
    public void b() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.s
    public void onScrollLimit(int i10, int i11, int i12, boolean z4) {
    }

    @Override // r0.s
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
