package qb;

import a8.r7;
import ab.g;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import b7.c;
import b7.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import f3.c0;
import f3.j0;
import f3.n;
import f3.q;
import h2.m0;
import j2.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.wf;
import org.telegram.ui.fr0;
import org.telegram.ui.p11;
import org.telegram.ui.qm;
import pb.h;
import u9.d;
import u9.e;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class a implements c, p11, eg.a, q, fg.a, bm0, e, bi, Continuation, d, b3.q, wf, l1, OnFailureListener, u4.c, y9.a {
    public static final /* synthetic */ a b = new a(14);
    public static a c;
    public static a d;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    public static Calendar u4() {
        if (d == null) {
            d = new a(27);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z9) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(ij ijVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        switch (this.a) {
        }
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, ij ijVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, o2 o2Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // eg.a
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(fj fjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, o10 o10Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.a;
    }

    @Override // b3.q
    public Object L1(Uri uri, k kVar) {
        return Long.valueOf(m0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 N1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(q1 q1Var, boolean z9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // f3.q
    public j0 O1(int i7, int i10) {
        return new n();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(ij ijVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ int S0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(ij ijVar) {
        int i7 = this.a;
        return f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, long j3) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.wf
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // y9.a
    public void a2(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public void c0(qg qgVar) {
        qgVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean d1() {
        return false;
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        return new pb.d(r7Var.c(h.class));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1(q1 q1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(q1 q1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // u9.e
    public List i(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new u9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new g(18, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 k2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean l1() {
        return false;
    }

    @Override // b7.c
    public int m(Context context, String str, boolean z9) {
        return f.d(context, str, z9);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(r5 r5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ qm o0() {
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // b7.c
    public int q(Context context, String str) {
        return f.a(context, str);
    }

    @Override // fg.a
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.q0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.u.q0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else {
            if (i7 != i10) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, boolean z9) {
        int i7 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, float f10, float f11, boolean z9) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(ij ijVar) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, int i7) {
        int i10 = this.a;
    }

    public boolean x4(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String y(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
        int i7 = this.a;
    }

    public a(WearAuthListenerService wearAuthListenerService) {
        this.a = 1;
    }

    private final /* synthetic */ void A4() {
    }

    private final /* synthetic */ void B4() {
    }

    private final /* synthetic */ void E4() {
    }

    private final /* synthetic */ void F4() {
    }

    private final /* synthetic */ void I4() {
    }

    private final /* synthetic */ void J4() {
    }

    private final /* synthetic */ void K3() {
    }

    private final /* synthetic */ void L3() {
    }

    private final /* synthetic */ void k3() {
    }

    private final /* synthetic */ void l3() {
    }

    private final /* synthetic */ void q2() {
    }

    private final /* synthetic */ void r2() {
    }

    private final /* synthetic */ void v4() {
    }

    private final /* synthetic */ void w2() {
    }

    private final /* synthetic */ void w4() {
    }

    private final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void D() {
    }

    @Override // org.telegram.ui.Components.wf
    public void E() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void I0() {
    }

    @Override // u4.c
    public void L() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void T1() {
    }

    @Override // f3.q
    public void U0() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.wf
    public void X1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void a() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.wf
    public void c1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void d2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.bm0
    public void finish() {
    }

    @Override // org.telegram.ui.Components.wf
    public void h1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void h2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void l2() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.wf
    public void r0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void t() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.wf
    public void t1() {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void w0() {
    }

    private final /* synthetic */ void A3(q1 q1Var) {
    }

    private final /* synthetic */ void B3(q1 q1Var) {
    }

    private final /* synthetic */ void C2(q1 q1Var) {
    }

    private final /* synthetic */ void C3(q1 q1Var) {
    }

    private final /* synthetic */ void C4(int i7) {
    }

    private final /* synthetic */ void D2(q1 q1Var) {
    }

    private final /* synthetic */ void D3(q1 q1Var) {
    }

    private final /* synthetic */ void D4(int i7) {
    }

    private final /* synthetic */ void E3(q1 q1Var) {
    }

    private final /* synthetic */ void F3(q1 q1Var) {
    }

    private final /* synthetic */ void G4(ij ijVar) {
    }

    private final /* synthetic */ void H4(ij ijVar) {
    }

    private final /* synthetic */ void I2(q1 q1Var) {
    }

    private final /* synthetic */ void I3(q1 q1Var) {
    }

    private final /* synthetic */ void J2(q1 q1Var) {
    }

    private final /* synthetic */ void J3(q1 q1Var) {
    }

    private final /* synthetic */ void K2(fj fjVar) {
    }

    private final /* synthetic */ void L2(fj fjVar) {
    }

    private final /* synthetic */ void M2(q1 q1Var) {
    }

    private final /* synthetic */ void N2(q1 q1Var) {
    }

    private final /* synthetic */ void Q2(q1 q1Var) {
    }

    private final /* synthetic */ void R2(q1 q1Var) {
    }

    private final /* synthetic */ void S3(String str) {
    }

    private final /* synthetic */ void T3(String str) {
    }

    private final /* synthetic */ void U2(q1 q1Var) {
    }

    private final /* synthetic */ void V2(q1 q1Var) {
    }

    private final /* synthetic */ void Y3(q1 q1Var) {
    }

    private final /* synthetic */ void Z3(q1 q1Var) {
    }

    private final /* synthetic */ void c3(q1 q1Var) {
    }

    private final /* synthetic */ void c4(q1 q1Var) {
    }

    private final /* synthetic */ void d3(q1 q1Var) {
    }

    private final /* synthetic */ void d4(q1 q1Var) {
    }

    private final /* synthetic */ void e3(q1 q1Var) {
    }

    private final /* synthetic */ void e4(ij ijVar) {
    }

    private final /* synthetic */ void f3(q1 q1Var) {
    }

    private final /* synthetic */ void f4(ij ijVar) {
    }

    private final /* synthetic */ void g4(q1 q1Var) {
    }

    private final /* synthetic */ void h4(q1 q1Var) {
    }

    private final /* synthetic */ void k4(q1 q1Var) {
    }

    private final /* synthetic */ void l4(q1 q1Var) {
    }

    private final /* synthetic */ void q4(q1 q1Var) {
    }

    private final /* synthetic */ void s2(q1 q1Var) {
    }

    private final /* synthetic */ void s4(q1 q1Var) {
    }

    private final /* synthetic */ void t2(q1 q1Var) {
    }

    private final /* synthetic */ void u2(q1 q1Var) {
    }

    private final /* synthetic */ void u3(q1 q1Var) {
    }

    private final /* synthetic */ void v2(q1 q1Var) {
    }

    private final /* synthetic */ void v3(q1 q1Var) {
    }

    private final /* synthetic */ void y2(q1 q1Var) {
    }

    private final /* synthetic */ void z2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.bm0
    public void A(float f10) {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bm0
    public void O(t2 t2Var) {
    }

    @Override // org.telegram.ui.Components.wf
    public void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wf
    public void Y1(boolean z9) {
    }

    @Override // f3.q
    public void f(c0 c0Var) {
    }

    @Override // org.telegram.ui.Components.wf
    public void k1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.wf
    public /* synthetic */ void w(float f10) {
    }

    private final /* synthetic */ void A2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void B2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O2(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void P2(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void S2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void T2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void U3(q1 q1Var, long j3) {
    }

    private final /* synthetic */ void V3(q1 q1Var, long j3) {
    }

    private final /* synthetic */ void Y2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void Z2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void a3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void b3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void i3(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void i4(q1 q1Var, o10 o10Var) {
    }

    private final /* synthetic */ void j3(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void j4(q1 q1Var, o10 o10Var) {
    }

    private final /* synthetic */ void m4(q1 q1Var, boolean z9) {
    }

    private final /* synthetic */ void o2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o4(q1 q1Var, boolean z9) {
    }

    private final /* synthetic */ void p2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void w3(String str, String str2) {
    }

    private final /* synthetic */ void x3(String str, String str2) {
    }

    @Override // org.telegram.ui.Components.wf
    public void M(float f10, int i7) {
    }

    @Override // u4.c
    public void l0(int i7, Object obj) {
    }

    private final /* synthetic */ void G2(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final /* synthetic */ void G3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void H2(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final /* synthetic */ void H3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void M3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final /* synthetic */ void N3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final /* synthetic */ void W2(q1 q1Var, int i7, int i10) {
    }

    private final /* synthetic */ void X2(q1 q1Var, int i7, int i10) {
    }

    private final /* synthetic */ void a4(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void b4(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void m2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void m3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void n2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void n3(q1 q1Var, float f10, float f11) {
    }

    private final void n4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void p4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void r4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void t4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final /* synthetic */ void y3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void z3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Components.wf
    public void a1(CharSequence charSequence, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wf
    public void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override // eg.a
    public int z1(int i7, int i10, int i11) {
        return i7;
    }

    private final /* synthetic */ void O3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void P3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void Q3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void R3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void g3(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void h3(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void o3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void p3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Components.bi
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
    }

    private final /* synthetic */ void W3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void X3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void q3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final /* synthetic */ void r3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final /* synthetic */ void s3(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void t3(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
    }

    private final /* synthetic */ void E2(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void F2(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }

    private final /* synthetic */ void y4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final /* synthetic */ void z4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
