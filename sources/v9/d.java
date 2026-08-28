package v9;

import android.content.Context;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.m;
import androidx.lifecycle.s0;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.ComponentRegistrar;
import d5.f0;
import d5.q;
import h3.t1;
import ih.v3;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import l.w;
import mh.c4;
import na.n;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.a61;
import org.telegram.ui.fm;
import org.telegram.ui.nu0;
import y3.i;
import y3.j;
import y3.k;
import ya.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements y2.b, Continuation, ef.a, a61, jf.a, y8.e, w, m9.a, n, kb, k1, s, y8.d, s0, j {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i9) {
        this.a = i9;
    }

    public static k0 k3(j0 j0Var, n2.w wVar) {
        IOException iOException = (IOException) wVar.c;
        if (!(iOException instanceof h0)) {
            return null;
        }
        int i9 = ((h0) iOException).d;
        if (i9 != 403 && i9 != 404 && i9 != 410 && i9 != 416 && i9 != 500 && i9 != 503) {
            return null;
        }
        if (j0Var.a(1)) {
            return new k0(1, 300000L);
        }
        if (j0Var.a(2)) {
            return new k0(2, 60000L);
        }
        return null;
    }

    public static long m3(n2.w wVar) {
        Throwable th = (IOException) wVar.c;
        if ((th instanceof t1) || (th instanceof FileNotFoundException) || (th instanceof e0) || (th instanceof p0)) {
            return -9223372036854775807L;
        }
        int i9 = com.google.android.exoplayer2.upstream.n.b;
        while (th != null) {
            if ((th instanceof com.google.android.exoplayer2.upstream.n) && ((com.google.android.exoplayer2.upstream.n) th).a == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((wVar.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    public static void z3(String str) {
        if (str == null || str.length() == 0) {
            throw new bc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new bc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
        int i9 = this.a;
    }

    @Override // jf.a
    public int B1(int i9, int i10, int i11) {
        return (i10 == 6 ? jf.a.l : i10 > i11 ? jf.a.i : i10 < i11 ? jf.a.j : jf.a.k).B1(i9, i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String C(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        int i9 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        int i11 = this.a;
    }

    @Override // y3.j
    public k G(i iVar) {
        int i9 = f0.a;
        if (i9 < 23 || i9 < 31) {
            return new ya.b(26).G(iVar);
        }
        int g10 = q.g(iVar.c.B);
        d5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + f0.B(g10));
        return new w4.e(g10).G(iVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // jf.a
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        (i9 == 6 ? jf.a.l : i9 > i10 ? jf.a.i : i9 < i10 ? jf.a.j : jf.a.k).H0(shortBuffer, i9, shortBuffer2, i10);
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        switch (this.a) {
            case 24:
                ya.a aVar = new ya.a();
                m mVar = new m(6);
                ReferenceQueue referenceQueue = aVar.a;
                Set set = aVar.b;
                set.add(new l(aVar, referenceQueue, set, mVar));
                Thread thread = new Thread(new fm(referenceQueue, set, false, 9), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            default:
                return new ya.k((Context) bVar.a(Context.class));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // na.n
    public Object Y1() {
        switch (this.a) {
            case 16:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        int i9 = this.a;
        return ll.a(messageObject);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 a(Class cls) {
        return new w1.b();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        t6.d dVar = (t6.d) ((t6.e) obj).u();
        l6.b bVar = new l6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i9 = t6.c.a;
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

    @Override // y8.e
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (y8.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new y8.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new v3(2, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // ef.a
    public boolean d(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.kb
    public void e(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        o1.j jVar = new o1.j(lbVar, lb.IN_OUT_OFFSET_Y, lbVar.getHeight());
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new jb(xaVar, lbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean f() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kb
    public void g(lb lbVar, wa waVar, fg fgVar, dl dlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        dlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        o1.j jVar = new o1.j(lbVar, lb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new c4(1, lbVar, fgVar));
        jVar.b(new jb(dlVar, lbVar, 1));
        jVar.f();
        waVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // nc.a
    public Object get() {
        ya.b bVar = new ya.b(7);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(t2.d.a, new c3.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(t2.d.c, new c3.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c3.c.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(t2.d.b, new c3.b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < t2.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new c3.a(bVar, hashMap);
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
        int i10 = this.a;
    }

    @Override // l.w
    public boolean j(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // m9.a
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(org.telegram.ui.Cells.t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i9 = this.a;
    }

    public int l3(int i9) {
        return i9 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 o(Class cls, v1.b bVar) {
        return a(cls);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ o9 q2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(t5 t5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        int i9 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // ef.a
    public boolean v0(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    public /* synthetic */ d(t6.a aVar) {
        this.a = 22;
    }

    private final /* synthetic */ void A() {
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C2() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void I() {
    }

    private final /* synthetic */ void K() {
    }

    private final /* synthetic */ void Q1() {
    }

    private final /* synthetic */ void T1() {
    }

    private final /* synthetic */ void n3() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void r3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void y() {
    }

    private final /* synthetic */ void A2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void B2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void C0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void H(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void J0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void K2(String str) {
    }

    private final /* synthetic */ void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void L0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void L2(String str) {
    }

    private final /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void O(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void Q2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void R2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void U2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void V0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void V2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void W2(MessageObject messageObject) {
    }

    private final /* synthetic */ void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void X2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Y2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void Z2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void c0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void c3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void d3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void e3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void f1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final void g3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void i2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void i3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void j2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void j3(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void o1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void p1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void q1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void s2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void t2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void t3(int i9) {
    }

    private final /* synthetic */ void u1(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void u2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void u3(int i9) {
    }

    private final /* synthetic */ void v2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void x2(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void x3(MessageObject messageObject) {
    }

    private final /* synthetic */ void y0(org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void K1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void M2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    private final /* synthetic */ void N1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void N2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    private final /* synthetic */ void P0(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Q(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T0(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void a1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void a3(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    private final /* synthetic */ void b1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void b3(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    private final /* synthetic */ void f3(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void h3(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void j1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void k1(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    private final /* synthetic */ void m1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void m2(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void n1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // l.w
    public void c(l.k kVar, boolean z10) {
    }

    private final /* synthetic */ void E2(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void F2(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void S2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void T2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void U1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void V1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void h1(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    private final /* synthetic */ void i1(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    private final /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void p(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void p0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void t0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void y2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void z2(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void G2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void H2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void I2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void J1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void J2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final /* synthetic */ void Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final /* synthetic */ void v1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void O2(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final /* synthetic */ void P2(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final /* synthetic */ void a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void d2(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void h2(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void h0(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void n0(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void p3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
