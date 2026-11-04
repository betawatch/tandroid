package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class we0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ xe0 d;

    public we0(xe0 xe0Var, Context context) {
        this.d = xe0Var;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        xe0 xe0Var = this.d;
        if (xe0Var.R == b10 || xe0Var.y == b10) {
            return true;
        }
        if (b10 >= xe0Var.E && b10 < xe0Var.F) {
            return true;
        }
        if ((b10 < xe0Var.I || b10 >= xe0Var.J) && b10 != xe0Var.O) {
            return b10 >= xe0Var.V && b10 < xe0Var.W;
        }
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.Y;
    }

    @Override // u4.h0
    public final int d(int i3) {
        xe0 xe0Var = this.d;
        if (i3 == xe0Var.r) {
            return 0;
        }
        if (i3 == xe0Var.s || i3 == xe0Var.M || i3 == xe0Var.T || i3 == xe0Var.Q) {
            return 1;
        }
        if (i3 == xe0Var.w) {
            return 2;
        }
        if (i3 == xe0Var.y) {
            return 3;
        }
        if (i3 == xe0Var.x || i3 == xe0Var.K || i3 == xe0Var.N || i3 == xe0Var.S || i3 == xe0Var.U) {
            return 4;
        }
        if (i3 >= xe0Var.E && i3 < xe0Var.F) {
            return 5;
        }
        if (i3 >= xe0Var.I && i3 < xe0Var.J) {
            return 5;
        }
        if (i3 == xe0Var.G) {
            return 6;
        }
        if (i3 == xe0Var.L) {
            return 7;
        }
        if (i3 == xe0Var.O) {
            return 8;
        }
        if (i3 == xe0Var.P) {
            return 9;
        }
        if (i3 == xe0Var.R) {
            return 10;
        }
        if (i3 < xe0Var.V || i3 >= xe0Var.W) {
            return i3 == xe0Var.H ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r15 == (r0.F - 1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        r14 = (org.telegram.ui.ue0) r14;
        r14.b(r1, r15 - r0.E);
        r14.I = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        if (r15 == (r0.J - 1)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        TLRPC.User user;
        xe0 xe0Var = this.d;
        ArrayList arrayList = xe0Var.j0;
        long j10 = xe0Var.f;
        long j11 = xe0Var.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        boolean z10 = true;
        if (i11 == 1) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i3 == xe0Var.s) {
                if (xe0Var.p0 && j10 == org.telegram.messenger.h10.i(xe0Var.getAccountInstance().a).n) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746599, null));
                    return;
                } else if (j10 == org.telegram.messenger.h10.i(xe0Var.getAccountInstance().a).n) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131752403, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131747328, null));
                    return;
                }
            }
            if (i3 == xe0Var.M) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746023, null));
                return;
            } else if (i3 == xe0Var.Q) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131748888, null));
                return;
            } else {
                if (i3 == xe0Var.T) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131748889, null));
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) view;
            m70Var.setCanEdit(j10 == org.telegram.messenger.h10.i(xe0Var.getAccountInstance().a).n);
            if (xe0Var.p0 && j10 == org.telegram.messenger.h10.i(xe0Var.getAccountInstance().a).n) {
                if (xe0Var.d != null) {
                    m70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(xe0Var.c, false));
                    m70Var.d(0, null, false);
                    m70Var.b(true);
                    return;
                }
                return;
            }
            m70Var.b(!xe0Var.q0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xe0Var.e;
            if (tL_chatInviteExported2 != null) {
                m70Var.setLink(tL_chatInviteExported2.link);
                m70Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                m70Var.setLink(null);
                m70Var.d(0, null, false);
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(i2Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.r6.y(i2Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            String M0 = org.telegram.messenger.bd.M0(2131751714, null);
            boolean z11 = !arrayList.isEmpty();
            i2Var.a.l(M0, false);
            i2Var.b.setImageDrawable(xpVar);
            i2Var.c = z11;
            return;
        }
        if (i11 != 5) {
            switch (i11) {
                case 9:
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    TLRPC.ChatFull N0 = xe0Var.getMessagesController().N0(j11);
                    TLRPC.Chat M02 = xe0Var.getMessagesController().M0(Long.valueOf(j11));
                    if (N0 == null || !N0.paid_media_allowed || !org.telegram.messenger.t3.V(M02)) {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131752384, null));
                        break;
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131752383, null));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (i3 != xe0Var.R) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) xe0Var.n0.get(i3 - xe0Var.V);
                        TLRPC.User user2 = (TLRPC.User) xe0Var.l0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i3 != xe0Var.W - 1) {
                            i10 = i13;
                            user = user2;
                            if (user == null) {
                                a5Var.c(user, org.telegram.messenger.g5.m(0, user.first_name, user.last_name), org.telegram.messenger.bd.G(i10, "InviteLinkCount", new Object[0]), z10);
                                break;
                            }
                        } else {
                            i10 = i13;
                            user = user2;
                        }
                    } else {
                        user = xe0Var.getMessagesController().a2(Long.valueOf(j10));
                        i10 = xe0Var.g0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
                    if (i3 == xe0Var.H) {
                        TLRPC.ChatFull N02 = xe0Var.getMessagesController().N0(j11);
                        TLRPC.Chat M03 = xe0Var.getMessagesController().M0(Long.valueOf(j11));
                        if (N02 == null || !N02.paid_media_allowed || !org.telegram.messenger.t3.V(M03)) {
                            y8Var2.setText(org.telegram.messenger.bd.M0(2131752384, null));
                            break;
                        } else {
                            y8Var2.setText(org.telegram.messenger.bd.M0(2131752383, null));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = xe0Var.E;
        if (i3 < i14 || i3 >= xe0Var.F) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) xe0Var.k0.get(i3 - xe0Var.I);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i3 - i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.iz izVar;
        org.telegram.ui.ActionBar.e6 e6Var2;
        xe0 xe0Var = this.d;
        Context context = this.c;
        switch (i3) {
            case 1:
                view = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(this.c, xe0Var, null, true, xe0Var.h);
                m70Var.setPermanent(true);
                m70Var.setDelegate(new ve0(this, m70Var));
                view = m70Var;
                break;
            case 3:
                e6Var = ((org.telegram.ui.ActionBar.d2) xe0Var).resourceProvider;
                view = new org.telegram.ui.Cells.i2(64, context, e6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                view = new ue0(xe0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.iz izVar2 = new org.telegram.ui.Components.iz(context, null);
                izVar2.setIsSingleCell(true);
                izVar2.setViewType(9);
                izVar2.x = false;
                izVar = izVar2;
                view = izVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                v9Var.b(org.telegram.messenger.bd.M0(2131751576, null), false);
                org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                izVar = v9Var;
                view = izVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.a5(this.c, 8, 6, false, null);
                break;
            case 11:
                e6Var2 = ((org.telegram.ui.ActionBar.d2) xe0Var).resourceProvider;
                view = new org.telegram.ui.Cells.y8(context, e6Var2);
                break;
            default:
                FrameLayout d2Var = new ai.d2(context, 29);
                d2Var.addView(new qe0(context), b8.mf.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.bd.M0(xe0Var.h ? 2131746878 : 2131746879, null));
                d2Var.addView(textView, b8.mf.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                d2Var.setTag(-33024);
                view = d2Var;
                break;
        }
        return k2.p1.p(view, view, -1, -2);
    }
}
