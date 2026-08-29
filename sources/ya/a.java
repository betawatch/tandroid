package ya;

import a3.b;
import a9.e;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.emoji2.text.u;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.tasks.OnFailureListener;
import e2.c;
import f7.v;
import g9.l;
import hh.f;
import ie.j;
import j$.util.DesugarCollections;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import k6.d;
import o3.m;
import o3.t;
import o3.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zg;
import org.telegram.ui.c61;
import org.telegram.ui.jn;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements OnFailureListener, b, c, hf.a, d, c61, me.b, mf.a, nf.a, m, hg, j1, t0, pa.m, li, s0, e {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
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
    public static boolean A2(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
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
                u[] uVarArr = (u[]) editable.getSpans(selectionStart, min, u.class);
                if (uVarArr != null && uVarArr.length > 0) {
                    for (u uVar : uVarArr) {
                        int spanStart = editable.getSpanStart(uVar);
                        int spanEnd = editable.getSpanEnd(uVar);
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
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ boolean C0() {
        return true;
    }

    @Override // me.b
    public me.a E1(l lVar) {
        return new j(lVar);
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override // hf.a
    public boolean H0(Context context) {
        return e0.b.m(context);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        switch (this.a) {
            case 24:
                return new bb.a(0);
            default:
                return new ab.b(0);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M0(long j10) {
        return false;
    }

    @Override // mf.a
    public int M1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ o2 O0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // mf.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 Z0(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override // o3.m
    public w Z1(int i10, int i11) {
        return new o3.j();
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // hf.a
    public boolean d(Context context) {
        return e0.b.j(context);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ boolean f1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // pc.a
    public Object get() {
        v vVar = new v(8);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(v2.d.a, new e3.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(v2.d.c, new e3.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(e3.c.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(v2.d.b, new e3.b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < v2.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new e3.a(vVar, hashMap);
    }

    @Override // androidx.lifecycle.s0
    public p0 h(Class cls) {
        return new w1.b();
    }

    @Override // e2.c
    public void h0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Components.hg
    public boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // e2.c
    public void l0(int i10, Object obj) {
        String str;
        switch (i10) {
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
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ int m() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ jn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // pa.m
    public Object p2() {
        return new ConcurrentSkipListMap();
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // nf.a
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            nf.a.t.r0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            nf.a.q.r0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean r2(v0 v0Var, float f9, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public void x0(zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        return null;
    }

    @Override // k6.d
    public c8.a z(Context context, String str, k6.c cVar) {
        c8.a aVar = new c8.a();
        aVar.a = cVar.l(context, str);
        int i10 = 1;
        int i11 = cVar.i(context, str, true);
        aVar.b = i11;
        int i12 = aVar.a;
        if (i12 == 0) {
            i12 = 0;
            if (i11 == 0) {
                i10 = 0;
                aVar.c = i10;
                return aVar;
            }
        }
        if (i11 < i12) {
            i10 = -1;
        }
        aVar.c = i10;
        return aVar;
    }

    @Override // org.telegram.ui.Components.hg
    public void B() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.hg
    public void G1() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.hg
    public void e() {
    }

    @Override // o3.m
    public void e1() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.hg
    public void i2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void k0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.hg
    public void n1() {
    }

    @Override // org.telegram.ui.Components.hg
    public void o2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Components.hg
    public void r() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.hg
    public void s0() {
    }

    @Override // org.telegram.ui.Components.hg
    public void s1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.hg
    public void v2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.hg
    public void z2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
    }

    @Override // o3.m
    public void D1(t tVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.hg
    public void U(boolean z10) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void W(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.hg
    public void a1(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.hg
    public void f2(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void i0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.hg
    public void k2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void q0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void v(float f9) {
    }

    @Override // org.telegram.ui.Components.hg
    public void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.hg
    public /* synthetic */ void x(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void x1(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void y1(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.hg
    public void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public void I(float f9, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void J(v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void h2(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var, f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void K1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void b0(v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void g1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.hg
    public void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Components.hg
    public void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void t2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.hg
    public void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.li
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
