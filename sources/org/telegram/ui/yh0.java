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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yh0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ zh0 d;

    public yh0(zh0 zh0Var, Context context) {
        this.d = zh0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zh0 zh0Var = this.d;
        if (zh0Var.Q == b10 || zh0Var.x == b10) {
            return true;
        }
        if (b10 >= zh0Var.y && b10 < zh0Var.E) {
            return true;
        }
        if ((b10 < zh0Var.H || b10 >= zh0Var.I) && b10 != zh0Var.N) {
            return b10 >= zh0Var.U && b10 < zh0Var.V;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.h0
    public final int j(int i10) {
        zh0 zh0Var = this.d;
        if (i10 == zh0Var.r) {
            return 0;
        }
        if (i10 == zh0Var.s || i10 == zh0Var.L || i10 == zh0Var.S || i10 == zh0Var.P) {
            return 1;
        }
        if (i10 == zh0Var.v) {
            return 2;
        }
        if (i10 == zh0Var.x) {
            return 3;
        }
        if (i10 == zh0Var.w || i10 == zh0Var.J || i10 == zh0Var.M || i10 == zh0Var.R || i10 == zh0Var.T) {
            return 4;
        }
        if (i10 >= zh0Var.y && i10 < zh0Var.E) {
            return 5;
        }
        if (i10 >= zh0Var.H && i10 < zh0Var.I) {
            return 5;
        }
        if (i10 == zh0Var.F) {
            return 6;
        }
        if (i10 == zh0Var.K) {
            return 7;
        }
        if (i10 == zh0Var.N) {
            return 8;
        }
        if (i10 == zh0Var.O) {
            return 9;
        }
        if (i10 == zh0Var.Q) {
            return 10;
        }
        if (i10 < zh0Var.U || i10 >= zh0Var.V) {
            return i10 == zh0Var.G ? 11 : 1;
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
    
        r14 = (org.telegram.ui.wh0) r14;
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
        zh0 zh0Var = this.d;
        ArrayList arrayList = zh0Var.i0;
        long j3 = zh0Var.f;
        long j10 = zh0Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == zh0Var.s) {
                if (zh0Var.o0 && j3 == zh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j3 == zh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == zh0Var.L) {
                m4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == zh0Var.P) {
                m4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == zh0Var.S) {
                    m4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.f90 f90Var = (org.telegram.ui.Components.f90) view;
            f90Var.setCanEdit(j3 == zh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (zh0Var.o0 && j3 == zh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (zh0Var.d != null) {
                    f90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(zh0Var.c));
                    f90Var.d(0, null, false);
                    f90Var.b(true);
                    return;
                }
                return;
            }
            f90Var.b(!zh0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zh0Var.e;
            if (tL_chatInviteExported2 != null) {
                f90Var.setLink(tL_chatInviteExported2.link);
                f90Var.c(tL_chatInviteExported2, j10);
                return;
            } else {
                f90Var.setLink(null);
                f90Var.d(0, null, false);
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
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            f2Var.a.l(string, false);
            f2Var.b.setImageDrawable(vqVar);
            f2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    TLRPC.ChatFull chatFull = zh0Var.getMessagesController().getChatFull(j10);
                    TLRPC.Chat chat = zh0Var.getMessagesController().getChat(Long.valueOf(j10));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        f9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (i10 != zh0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) zh0Var.m0.get(i10 - zh0Var.U);
                        TLRPC.User user2 = (TLRPC.User) zh0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != zh0Var.V - 1) {
                            i11 = i13;
                            user = user2;
                            if (user == null) {
                                b5Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i13;
                            user = user2;
                        }
                    } else {
                        user = zh0Var.getMessagesController().getUser(Long.valueOf(j3));
                        i11 = zh0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.f9 f9Var2 = (org.telegram.ui.Cells.f9) view;
                    if (i10 == zh0Var.G) {
                        TLRPC.ChatFull chatFull2 = zh0Var.getMessagesController().getChatFull(j10);
                        TLRPC.Chat chat2 = zh0Var.getMessagesController().getChat(Long.valueOf(j10));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            f9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            f9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = zh0Var.y;
        if (i10 < i14 || i10 >= zh0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) zh0Var.j0.get(i10 - zh0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        zh0 zh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(this.c, zh0Var, null, true, zh0Var.h);
                f90Var.setPermanent(true);
                f90Var.setDelegate(new xh0(this, f90Var));
                view = f90Var;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.p2) zh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f2(context, 64, f6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 5:
                view = new wh0(zh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(9);
                a10Var.w = false;
                view = a10Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 8:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                view = gaVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(8, 6, this.c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) zh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f9(context, f6Var2);
                break;
            default:
                FrameLayout sh0Var = new sh0(context);
                sh0Var.addView(new rh0(context), w7.a6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(zh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                sh0Var.addView(textView, w7.a6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                sh0Var.setTag(-33024);
                view = sh0Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
