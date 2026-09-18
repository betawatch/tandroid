package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zh0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ ai0 d;

    public zh0(ai0 ai0Var, Context context) {
        this.d = ai0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ai0 ai0Var = this.d;
        if (ai0Var.Q == b10 || ai0Var.x == b10) {
            return true;
        }
        if (b10 >= ai0Var.y && b10 < ai0Var.E) {
            return true;
        }
        if ((b10 < ai0Var.H || b10 >= ai0Var.I) && b10 != ai0Var.N) {
            return b10 >= ai0Var.U && b10 < ai0Var.V;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ai0 ai0Var = this.d;
        if (i10 == ai0Var.r) {
            return 0;
        }
        if (i10 == ai0Var.s || i10 == ai0Var.L || i10 == ai0Var.S || i10 == ai0Var.P) {
            return 1;
        }
        if (i10 == ai0Var.v) {
            return 2;
        }
        if (i10 == ai0Var.x) {
            return 3;
        }
        if (i10 == ai0Var.w || i10 == ai0Var.J || i10 == ai0Var.M || i10 == ai0Var.R || i10 == ai0Var.T) {
            return 4;
        }
        if (i10 >= ai0Var.y && i10 < ai0Var.E) {
            return 5;
        }
        if (i10 >= ai0Var.H && i10 < ai0Var.I) {
            return 5;
        }
        if (i10 == ai0Var.F) {
            return 6;
        }
        if (i10 == ai0Var.K) {
            return 7;
        }
        if (i10 == ai0Var.N) {
            return 8;
        }
        if (i10 == ai0Var.O) {
            return 9;
        }
        if (i10 == ai0Var.Q) {
            return 10;
        }
        if (i10 < ai0Var.U || i10 >= ai0Var.V) {
            return i10 == ai0Var.G ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r15 == (r0.E - 1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        r14 = (org.telegram.ui.xh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.H = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.I - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        ai0 ai0Var = this.d;
        ArrayList arrayList = ai0Var.i0;
        long j3 = ai0Var.f;
        long j10 = ai0Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == ai0Var.s) {
                if (ai0Var.o0 && j3 == ai0Var.getAccountInstance().getUserConfig().clientUserId) {
                    l4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j3 == ai0Var.getAccountInstance().getUserConfig().clientUserId) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == ai0Var.L) {
                l4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == ai0Var.P) {
                l4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == ai0Var.S) {
                    l4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) view;
            v80Var.setCanEdit(j3 == ai0Var.getAccountInstance().getUserConfig().clientUserId);
            if (ai0Var.o0 && j3 == ai0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (ai0Var.d != null) {
                    v80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(ai0Var.c));
                    v80Var.d(0, null, false);
                    v80Var.b(true);
                    return;
                }
                return;
            }
            v80Var.b(!ai0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ai0Var.e;
            if (tL_chatInviteExported2 != null) {
                v80Var.setLink(tL_chatInviteExported2.link);
                v80Var.c(tL_chatInviteExported2, j10);
                return;
            } else {
                v80Var.setLink(null);
                v80Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            f2Var.a.l(string, false);
            f2Var.b.setImageDrawable(pqVar);
            f2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    TLRPC.ChatFull chatFull = ai0Var.getMessagesController().getChatFull(j10);
                    TLRPC.Chat chat = ai0Var.getMessagesController().getChat(Long.valueOf(j10));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (i10 != ai0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ai0Var.m0.get(i10 - ai0Var.U);
                        TLRPC.User user2 = (TLRPC.User) ai0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != ai0Var.V - 1) {
                            i11 = i13;
                            user = user2;
                            if (user == null) {
                                a5Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i13;
                            user = user2;
                        }
                    } else {
                        user = ai0Var.getMessagesController().getUser(Long.valueOf(j3));
                        i11 = ai0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
                    if (i10 == ai0Var.G) {
                        TLRPC.ChatFull chatFull2 = ai0Var.getMessagesController().getChatFull(j10);
                        TLRPC.Chat chat2 = ai0Var.getMessagesController().getChat(Long.valueOf(j10));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            e9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            e9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = ai0Var.y;
        if (i10 < i14 || i10 >= ai0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ai0Var.j0.get(i10 - ai0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        ai0 ai0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(this.c, ai0Var, null, true, ai0Var.h);
                v80Var.setPermanent(true);
                v80Var.setDelegate(new yh0(this, v80Var));
                view = v80Var;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.o2) ai0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f2(context, 64, f6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 5:
                view = new xh0(ai0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(9);
                t00Var.w = false;
                view = t00Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                view = eaVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.a5(8, 6, this.c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.o2) ai0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e9(context, f6Var2);
                break;
            default:
                FrameLayout th0Var = new th0(context);
                th0Var.addView(new sh0(context), w7.x5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(ai0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                th0Var.addView(textView, w7.x5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                th0Var.setTag(-33024);
                view = th0Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
