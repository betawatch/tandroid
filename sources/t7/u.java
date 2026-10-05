package t7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import l.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.kv0;
import org.telegram.ui.z61;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class u implements bg.a, c3.g, cg.a, ea.a, fb.n, g2.g, com.google.android.gms.common.api.internal.s, w, n6.k, q9.d, yo0, l1, p2.s, OnFailureListener, r4.c, u9.a, SuccessContinuation, x9.c, y6.d, y2.i, z61 {
    public static u a;
    public static u b;

    public /* synthetic */ u(Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // q9.d
    public Object E(cf.c cVar) {
        return new qb.d(cVar.d(qb.h.class));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // u9.a
    public void H(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // p2.s
    public y2.n K() {
        return new p2.r(p2.o.n, null);
    }

    @Override // bg.a
    public int L1(int i10, int i11, int i12) {
        return (i11 == 6 ? bg.a.l : i11 > i12 ? bg.a.i : i11 < i12 ? bg.a.j : bg.a.k).L1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // bg.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? bg.a.l : i10 > i11 ? bg.a.i : i10 < i11 ? bg.a.j : bg.a.k).S0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // p2.s
    public y2.n V(p2.o oVar, p2.l lVar) {
        return new p2.r(oVar, lVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.yo0
    public void Y(float f7, boolean z10) {
        zd.b = f7 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kv0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Z() {
        return null;
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
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.a;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(int i10, u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.t(false);
    }

    @Override // y6.d
    public a3.l d(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int i10 = cVar.i(context, str, true);
        lVar.b = i10;
        if (i10 != 0) {
            lVar.c = 1;
            return lVar;
        }
        int m10 = cVar.m(context, str);
        lVar.a = m10;
        if (m10 != 0) {
            lVar.c = -1;
        }
        return lVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        return false;
    }

    @Override // x9.c
    public String f() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Components.yo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override // n6.k
    public /* bridge */ /* synthetic */ Object i(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(z5 z5Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Components.yo0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // fb.n
    public Object p2() {
        return new ConcurrentSkipListMap();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // cg.a
    public void x(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // ea.a
    public StackTraceElement[] y(StackTraceElement[] stackTraceElementArr) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.yo0
    public void B() {
    }

    @Override // r4.c
    public void C() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // x9.c
    public void b() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // y2.i
    public void q() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
    }

    @Override // c3.g
    public long m(long j3) {
        return j3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(u1 u1Var) {
    }

    @Override // r4.c
    public void D(int i10, Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // l.w
    public void c(l.k kVar, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
