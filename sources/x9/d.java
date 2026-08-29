package x9;

import a5.j;
import ab.n;
import ab.o;
import ab.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.exoplayer2.upstream.d0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kg.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.y5;
import org.telegram.ui.lu0;
import pa.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class d implements OnFailureListener, s0, l, e2.c, n0, SuccessContinuation, h9.c, k6.d, a9.g, mf.a, n9.b, o3.c, o9.a, j1, v2.e, m, a9.e {
    public static volatile d b;
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // a9.e
    public Object I0(j jVar) {
        ab.a aVar = new ab.a();
        n nVar = new n(0);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new p(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new o(0, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // mf.a
    public int M1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // mf.a
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
                shortBuffer2.put(bb.a.s3(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 Z0(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public void a() {
        synchronized (f5.a.h) {
            Object obj = f5.a.i;
            synchronized (obj) {
                if (f5.a.j) {
                    return;
                }
                long a2 = f5.a.a();
                synchronized (obj) {
                    f5.a.k = a2;
                    f5.a.j = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // v2.e
    public Object apply(Object obj) {
        return ((w3) obj).a();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new d0(false);
    }

    @Override // n9.b
    public n9.a d(ya.a aVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        a5.c cVar = jSONObject.has("session") ? new a5.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new a5.c(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new n9.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), cVar, new kb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // a9.g
    public List e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (a9.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                bVar = new a9.b(str, bVar.b, bVar.c, bVar.d, bVar.e, new w(5, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 h(Class cls) {
        return new m0(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // h9.c
    public String i() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var, hh.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
        int i10 = this.a;
    }

    @Override // o9.a
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    public Signature[] m3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(y5 y5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // pa.m
    public Object p2() {
        switch (this.a) {
            case 20:
                return new ArrayList();
            default:
                return new pa.l(true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f9, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // k6.d
    public c8.a z(Context context, String str, k6.c cVar) {
        c8.a aVar = new c8.a();
        int i10 = cVar.i(context, str, true);
        aVar.b = i10;
        if (i10 != 0) {
            aVar.c = 1;
            return aVar;
        }
        int l10 = cVar.l(context, str);
        aVar.a = l10;
        if (l10 != 0) {
            aVar.c = -1;
        }
        return aVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B1() {
    }

    private final /* synthetic */ void D() {
    }

    private final /* synthetic */ void E2() {
    }

    private final /* synthetic */ void F2() {
    }

    private final /* synthetic */ void G() {
    }

    private final /* synthetic */ void W() {
    }

    private final /* synthetic */ void a0() {
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

    private final /* synthetic */ void z1() {
    }

    private final /* synthetic */ void z3() {
    }

    @Override // h9.c
    public void b() {
    }

    @Override // e2.c
    public void h0() {
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public void q() {
    }

    private final /* synthetic */ void C2(s1 s1Var) {
    }

    private final /* synthetic */ void D2(s1 s1Var) {
    }

    private final /* synthetic */ void E0(s1 s1Var) {
    }

    private final /* synthetic */ void G0(s1 s1Var) {
    }

    private final /* synthetic */ void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void I(s1 s1Var) {
    }

    private final /* synthetic */ void J(s1 s1Var) {
    }

    private final /* synthetic */ void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void L0(s1 s1Var) {
    }

    private final /* synthetic */ void M(s1 s1Var) {
    }

    private final /* synthetic */ void M2(String str) {
    }

    private final /* synthetic */ void N2(String str) {
    }

    private final /* synthetic */ void O0(s1 s1Var) {
    }

    private final /* synthetic */ void S2(s1 s1Var) {
    }

    private final /* synthetic */ void T2(s1 s1Var) {
    }

    private final /* synthetic */ void U(s1 s1Var) {
    }

    private final /* synthetic */ void U0(s1 s1Var) {
    }

    private final /* synthetic */ void W2(s1 s1Var) {
    }

    private final /* synthetic */ void X2(s1 s1Var) {
    }

    private final /* synthetic */ void Y2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Z2(MessageObject messageObject) {
    }

    private final /* synthetic */ void a1(s1 s1Var) {
    }

    private final /* synthetic */ void a3(s1 s1Var) {
    }

    private final /* synthetic */ void b0(s1 s1Var) {
    }

    private final /* synthetic */ void b3(s1 s1Var) {
    }

    private final /* synthetic */ void e1(s1 s1Var) {
    }

    private final /* synthetic */ void e3(s1 s1Var) {
    }

    private final /* synthetic */ void f1(s1 s1Var) {
    }

    private final /* synthetic */ void f2(s1 s1Var) {
    }

    private final /* synthetic */ void f3(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final /* synthetic */ void h2(s1 s1Var) {
    }

    private final /* synthetic */ void i0(s1 s1Var) {
    }

    private final void i3(s1 s1Var) {
    }

    private final /* synthetic */ void k3(s1 s1Var) {
    }

    private final /* synthetic */ void l2(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void o2(s1 s1Var) {
    }

    private final /* synthetic */ void q0(s1 s1Var) {
    }

    private final /* synthetic */ void q1(s1 s1Var) {
    }

    private final /* synthetic */ void r0(s1 s1Var) {
    }

    private final /* synthetic */ void r1(s1 s1Var) {
    }

    private final /* synthetic */ void r2(s1 s1Var) {
    }

    private final /* synthetic */ void s1(s1 s1Var) {
    }

    private final /* synthetic */ void t1(s1 s1Var) {
    }

    private final /* synthetic */ void t2(s1 s1Var) {
    }

    private final /* synthetic */ void t3(int i10) {
    }

    private final /* synthetic */ void u3(int i10) {
    }

    private final /* synthetic */ void v2(s1 s1Var) {
    }

    private final /* synthetic */ void x3(MessageObject messageObject) {
    }

    private final /* synthetic */ void y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void z2(s1 s1Var) {
    }

    @Override // o3.c
    public long l(long j10) {
        return j10;
    }

    private final /* synthetic */ void B(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void P2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void Q0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void T0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void b1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void c3(s1 s1Var, hh.f fVar) {
    }

    private final /* synthetic */ void d1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d3(s1 s1Var, hh.f fVar) {
    }

    private final /* synthetic */ void h3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void i2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void j1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void j3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void k0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void l1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void n1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void x(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void x1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void y1(int i10, s1 s1Var) {
    }

    @Override // e2.c
    public void l0(int i10, Object obj) {
    }

    private final /* synthetic */ void A2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void B2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void C0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void D1(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void E1(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void G2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void H2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void U2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void V2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void g1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void i1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void r(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void v(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void x0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void G1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void I2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final /* synthetic */ void J2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final /* synthetic */ void K1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void K2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void v1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void w1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void Q2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void T1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void X1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void Z1(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void d2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void s0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void u0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void p3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
