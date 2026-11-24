// default package

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vi1 extends LinearLayout {
    public static final /* synthetic */ int y = 0;
    public final int a;
    public final ri1 b;
    public final ui1 c;
    public final yc d;
    public final long e;
    public final ei1 f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] w;
    public final /* synthetic */ zi1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi1(zi1 zi1Var, Activity activity, int i, long j, int i2, ei1 ei1Var, wjb wjbVar) {
        super(activity);
        this.x = zi1Var;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.w = new boolean[]{false, false};
        this.a = i;
        this.e = j;
        this.f = ei1Var;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        ri1 ri1Var = new ri1(this, activity, wjbVar, zi1Var);
        this.b = ri1Var;
        ui1 ui1Var = new ui1(this, activity, i, j, i2, wjbVar);
        this.c = ui1Var;
        ri1Var.setAdapter(ui1Var);
        vec l = ri1Var.l(-2, true);
        qw4 qw4Var = zi1Var.d1;
        if (qw4Var != null) {
            qw4Var.c(ri1Var);
        }
        yc ycVar = new yc((byte) 8, activity, this);
        this.d = ycVar;
        ycVar.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        ycVar.addView(l, nme.e(-1, 48, 48));
        addView(ri1Var, nme.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.n.isEmpty() && this.r.isEmpty()) ? false : true;
    }

    public final boolean b(int i) {
        boolean isEmpty;
        if (i == 1) {
            isEmpty = this.n.isEmpty();
        } else {
            if (i != 0) {
                return false;
            }
            isEmpty = this.r.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i) {
        boolean[] zArr = this.w;
        if (zArr[i]) {
            return;
        }
        final boolean a = a();
        final boolean b = b(i);
        long j = this.e;
        zi1 zi1Var = this.x;
        int i2 = this.a;
        if (i == 1) {
            if (this.h == null || !zi1Var.b1) {
                return;
            }
            zArr[i] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = na7.q1(i2).h1(j);
            tL_payments_getStarsTransactions.offset = this.h;
            tL_payments_getStarsTransactions.limit = this.n.isEmpty() ? 5 : 20;
            final byte b2 = 0;
            ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: pi1
                public final /* synthetic */ vi1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b2) {
                        case 0:
                            final byte b3 = 1;
                            final vi1 vi1Var = this.b;
                            final int i3 = i;
                            final boolean z = a;
                            final boolean z2 = b;
                            gl.d3(new Runnable() { // from class: qi1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ei1 ei1Var;
                                    ei1 ei1Var2;
                                    byte b4 = b3;
                                    boolean z3 = z2;
                                    boolean z4 = z;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    int i4 = i3;
                                    TLObject tLObject2 = tLObject;
                                    vi1 vi1Var2 = vi1Var;
                                    switch (b4) {
                                        case 0:
                                            int i5 = vi1Var2.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i5).a4(starsStatus.users, false);
                                                na7.q1(i5).U3(starsStatus.chats, false);
                                                vi1Var2.r.addAll(starsStatus.history);
                                                vi1Var2.s = starsStatus.next_offset;
                                                vi1Var2.w[i4] = false;
                                                vi1Var2.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var2.a() != z4 && (ei1Var = vi1Var2.f) != null) {
                                                ei1Var.run();
                                            }
                                            if (vi1Var2.b(i4) != z3) {
                                                vi1Var2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            int i6 = vi1Var2.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i6).a4(starsStatus2.users, false);
                                                na7.q1(i6).U3(starsStatus2.chats, false);
                                                vi1Var2.n.addAll(starsStatus2.history);
                                                vi1Var2.h = starsStatus2.next_offset;
                                                vi1Var2.w[i4] = false;
                                                vi1Var2.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var2.a() != z4 && (ei1Var2 = vi1Var2.f) != null) {
                                                ei1Var2.run();
                                            }
                                            if (vi1Var2.b(i4) != z3) {
                                                vi1Var2.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b4 = 0;
                            final vi1 vi1Var2 = this.b;
                            final int i4 = i;
                            final boolean z3 = a;
                            final boolean z4 = b;
                            gl.d3(new Runnable() { // from class: qi1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ei1 ei1Var;
                                    ei1 ei1Var2;
                                    byte b42 = b4;
                                    boolean z32 = z4;
                                    boolean z42 = z3;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    int i42 = i4;
                                    TLObject tLObject2 = tLObject;
                                    vi1 vi1Var22 = vi1Var2;
                                    switch (b42) {
                                        case 0:
                                            int i5 = vi1Var22.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i5).a4(starsStatus.users, false);
                                                na7.q1(i5).U3(starsStatus.chats, false);
                                                vi1Var22.r.addAll(starsStatus.history);
                                                vi1Var22.s = starsStatus.next_offset;
                                                vi1Var22.w[i42] = false;
                                                vi1Var22.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var22.a() != z42 && (ei1Var = vi1Var22.f) != null) {
                                                ei1Var.run();
                                            }
                                            if (vi1Var22.b(i42) != z32) {
                                                vi1Var22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            int i6 = vi1Var22.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i6).a4(starsStatus2.users, false);
                                                na7.q1(i6).U3(starsStatus2.chats, false);
                                                vi1Var22.n.addAll(starsStatus2.history);
                                                vi1Var22.h = starsStatus2.next_offset;
                                                vi1Var22.w[i42] = false;
                                                vi1Var22.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var22.a() != z42 && (ei1Var2 = vi1Var22.f) != null) {
                                                ei1Var2.run();
                                            }
                                            if (vi1Var22.b(i42) != z32) {
                                                vi1Var22.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (i == 0 && this.s != null && zi1Var.c1) {
            zArr[i] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = na7.q1(i2).h1(j);
            tL_payments_getStarsTransactions2.offset = this.s;
            tL_payments_getStarsTransactions2.limit = this.r.isEmpty() ? 5 : 20;
            final byte b3 = 1;
            ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: pi1
                public final /* synthetic */ vi1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b3) {
                        case 0:
                            final byte b32 = 1;
                            final vi1 vi1Var = this.b;
                            final int i3 = i;
                            final boolean z = a;
                            final boolean z2 = b;
                            gl.d3(new Runnable() { // from class: qi1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ei1 ei1Var;
                                    ei1 ei1Var2;
                                    byte b42 = b32;
                                    boolean z32 = z2;
                                    boolean z42 = z;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    int i42 = i3;
                                    TLObject tLObject2 = tLObject;
                                    vi1 vi1Var22 = vi1Var;
                                    switch (b42) {
                                        case 0:
                                            int i5 = vi1Var22.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i5).a4(starsStatus.users, false);
                                                na7.q1(i5).U3(starsStatus.chats, false);
                                                vi1Var22.r.addAll(starsStatus.history);
                                                vi1Var22.s = starsStatus.next_offset;
                                                vi1Var22.w[i42] = false;
                                                vi1Var22.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var22.a() != z42 && (ei1Var = vi1Var22.f) != null) {
                                                ei1Var.run();
                                            }
                                            if (vi1Var22.b(i42) != z32) {
                                                vi1Var22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            int i6 = vi1Var22.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i6).a4(starsStatus2.users, false);
                                                na7.q1(i6).U3(starsStatus2.chats, false);
                                                vi1Var22.n.addAll(starsStatus2.history);
                                                vi1Var22.h = starsStatus2.next_offset;
                                                vi1Var22.w[i42] = false;
                                                vi1Var22.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var22.a() != z42 && (ei1Var2 = vi1Var22.f) != null) {
                                                ei1Var2.run();
                                            }
                                            if (vi1Var22.b(i42) != z32) {
                                                vi1Var22.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b4 = 0;
                            final vi1 vi1Var2 = this.b;
                            final int i4 = i;
                            final boolean z3 = a;
                            final boolean z4 = b;
                            gl.d3(new Runnable() { // from class: qi1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ei1 ei1Var;
                                    ei1 ei1Var2;
                                    byte b42 = b4;
                                    boolean z32 = z4;
                                    boolean z42 = z3;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    int i42 = i4;
                                    TLObject tLObject2 = tLObject;
                                    vi1 vi1Var22 = vi1Var2;
                                    switch (b42) {
                                        case 0:
                                            int i5 = vi1Var22.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i5).a4(starsStatus.users, false);
                                                na7.q1(i5).U3(starsStatus.chats, false);
                                                vi1Var22.r.addAll(starsStatus.history);
                                                vi1Var22.s = starsStatus.next_offset;
                                                vi1Var22.w[i42] = false;
                                                vi1Var22.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var22.a() != z42 && (ei1Var = vi1Var22.f) != null) {
                                                ei1Var.run();
                                            }
                                            if (vi1Var22.b(i42) != z32) {
                                                vi1Var22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            int i6 = vi1Var22.a;
                                            if (tLObject2 instanceof TL_stars.StarsStatus) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                                                na7.q1(i6).a4(starsStatus2.users, false);
                                                na7.q1(i6).U3(starsStatus2.chats, false);
                                                vi1Var22.n.addAll(starsStatus2.history);
                                                vi1Var22.h = starsStatus2.next_offset;
                                                vi1Var22.w[i42] = false;
                                                vi1Var22.d();
                                            } else if (tL_error2 != null) {
                                                u21.e0(tL_error2);
                                            }
                                            if (vi1Var22.a() != z42 && (ei1Var2 = vi1Var22.f) != null) {
                                                ei1Var2.run();
                                            }
                                            if (vi1Var22.b(i42) != z32) {
                                                vi1Var22.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ri1 ri1Var = this.b;
            if (i >= ri1Var.getViewPages().length) {
                return;
            }
            View view = ri1Var.getViewPages()[i];
            if (view instanceof ti1) {
                ti1 ti1Var = (ti1) view;
                q5c q5cVar = ti1Var.a;
                q5cVar.g3.O(true);
                if (q5cVar.canScrollVertically(1)) {
                    for (int i2 = 0; i2 < q5cVar.getChildCount(); i2++) {
                        if (!(q5cVar.getChildAt(i2) instanceof pi4)) {
                        }
                    }
                }
                ti1Var.e.run();
                break;
            }
            i++;
        }
    }

    public final void e() {
        ui1 ui1Var = this.c;
        ArrayList arrayList = ui1Var.e;
        ArrayList arrayList2 = ui1Var.e;
        int size = arrayList.size();
        ri1 ri1Var = this.b;
        int h = size == 0 ? -1 : ui1Var.h(ri1Var.getCurrentPosition());
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            i |= 1 << ui1Var.h(i2);
        }
        ui1Var.i();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            int h2 = ui1Var.h(i5);
            i3 |= 1 << h2;
            if (h2 == h) {
                i4 = i5;
            }
        }
        if (i == i3) {
            return;
        }
        ri1Var.onTouchEvent(null);
        ri1Var.setPosition(i4);
        ri1Var.J();
        ri1Var.m(false);
        this.x.s();
    }

    public o39 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ti1) {
            return ((ti1) currentView).a;
        }
        return null;
    }
}
