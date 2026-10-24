package sb;

import ah.h0;
import ah.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.emoji2.text.v;
import androidx.lifecycle.p0;
import b2.w;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.l;
import d2.b;
import e2.m0;
import e9.n0;
import gb.m;
import gb.n;
import i5.e;
import j$.util.Objects;
import j7.c;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import n2.g;
import n2.h;
import n2.y;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.og;
import org.telegram.ui.a61;
import org.telegram.ui.in;
import org.telegram.ui.yu0;
import r2.j;
import r2.k;
import r2.o;
import r2.x;
import r9.d;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a implements a61, e, cg.a, r9.e, fa.a, n, r, y2.n, n2.n, d, og, k1, s0, k, OnFailureListener, androidx.lifecycle.s0, SuccessContinuation, y6.d {
    public static a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static MediaCodec r2(l lVar) {
        String str = ((o) lVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] s2(n0 n0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                u6.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
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
    public static boolean t2(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
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

    public static final CharSequence u2(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // cg.a
    public int E1(int i10, int i11, int i12) {
        return (i11 == 6 ? cg.a.o : i11 > i12 ? cg.a.k : i11 < i12 ? cg.a.l : cg.a.m).E1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override // n2.n
    public int I0(w wVar) {
        return wVar.w != null ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2.l J(l lVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = r2(lVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) lVar.d;
            mediaCodec.configure((MediaFormat) lVar.b, surface, (MediaCrypto) lVar.e, (surface == null && ((o) lVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new x(mediaCodec, (j) lVar.f);
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
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ o2 L0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // cg.a
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? cg.a.o : i10 > i11 ? cg.a.k : i10 < i11 ? cg.a.l : cg.a.m).P0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ yu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // n2.n
    public h U0(n2.k kVar, w wVar) {
        if (wVar.w == null) {
            return null;
        }
        return new n2.o(new g(6001, new y()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a W() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public p0 W0(Class cls, v1.b bVar) {
        return c(cls);
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int Y0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TL_stories.StoryItem a1() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = c.a;
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

    @Override // i5.e
    public Object apply(Object obj) {
        return ((y3) obj).a();
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean b1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 c(Class cls) {
        return new w1.b();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return b1.a(messageObject);
    }

    @Override // y2.n
    public Object d2(Uri uri, g2.k kVar) {
        return Long.valueOf(m0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public boolean e1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // gb.n
    public Object f2() {
        switch (this.a) {
            case 9:
                return new ArrayList();
            default:
                return new m(true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ boolean h2(v0 v0Var, float f7, float f10) {
        return false;
    }

    @Override // n2.n
    public /* synthetic */ n2.m j0(n2.k kVar, w wVar) {
        return n2.m.u;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        return new rb.d(z5Var.b(rb.h.class));
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(a6 a6Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ in p0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ p9 p2() {
        return null;
    }

    @Override // y6.d
    public a3.l r(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.a = cVar.y(context, str);
        int i10 = 1;
        int o10 = cVar.o(context, str, true);
        lVar.b = o10;
        int i11 = lVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (o10 == 0) {
                i10 = 0;
                lVar.c = i10;
                return lVar;
            }
        }
        if (o10 < i11) {
            i10 = -1;
        }
        lVar.c = i10;
        return lVar;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // fa.a
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
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
            i13 = 1;
            i10 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int u() {
        return 0;
    }

    @Override // r9.e
    public List v(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (r9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new r9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new h0(11, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
    }

    public a() {
        this.a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.og
    public void H() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.og
    public void Y1() {
    }

    @Override // n2.n
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.og
    public void e2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Components.og
    public void h() {
    }

    @Override // org.telegram.ui.Components.og
    public void i1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public void m2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.og
    public void n1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.og
    public void q2() {
    }

    @Override // n2.n
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.og
    public void t0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void u1() {
    }

    @Override // org.telegram.ui.Components.og
    public void y() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.og
    public void y1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void V1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void X0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void Z1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void b0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void k0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void q1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void r0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void s1(long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void t1(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void z(float f7) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.og
    public void D0(int i10, int i11) {
    }

    @Override // n2.n
    public void E(Looper looper, j2.j jVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, t tVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Components.og
    public void U(float f7, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void X(v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void X1(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void C1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void c1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void g0(v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public void g1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.og
    public void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void k2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
