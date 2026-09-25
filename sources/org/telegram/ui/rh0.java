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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rh0 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ sh0 d;

    public rh0(sh0 sh0Var, Context context) {
        this.d = sh0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        sh0 sh0Var = this.d;
        if (sh0Var.Q == b10 || sh0Var.x == b10) {
            return true;
        }
        if (b10 >= sh0Var.y && b10 < sh0Var.E) {
            return true;
        }
        if ((b10 < sh0Var.H || b10 >= sh0Var.I) && b10 != sh0Var.N) {
            return b10 >= sh0Var.U && b10 < sh0Var.V;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.h0
    public final int j(int i10) {
        sh0 sh0Var = this.d;
        if (i10 == sh0Var.r) {
            return 0;
        }
        if (i10 == sh0Var.s || i10 == sh0Var.L || i10 == sh0Var.S || i10 == sh0Var.P) {
            return 1;
        }
        if (i10 == sh0Var.v) {
            return 2;
        }
        if (i10 == sh0Var.x) {
            return 3;
        }
        if (i10 == sh0Var.w || i10 == sh0Var.J || i10 == sh0Var.M || i10 == sh0Var.R || i10 == sh0Var.T) {
            return 4;
        }
        if (i10 >= sh0Var.y && i10 < sh0Var.E) {
            return 5;
        }
        if (i10 >= sh0Var.H && i10 < sh0Var.I) {
            return 5;
        }
        if (i10 == sh0Var.F) {
            return 6;
        }
        if (i10 == sh0Var.K) {
            return 7;
        }
        if (i10 == sh0Var.N) {
            return 8;
        }
        if (i10 == sh0Var.O) {
            return 9;
        }
        if (i10 == sh0Var.Q) {
            return 10;
        }
        if (i10 < sh0Var.U || i10 >= sh0Var.V) {
            return i10 == sh0Var.G ? 11 : 1;
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
    
        r14 = (org.telegram.ui.ph0) r14;
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
        sh0 sh0Var = this.d;
        ArrayList arrayList = sh0Var.i0;
        long j3 = sh0Var.f;
        long j10 = sh0Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == sh0Var.s) {
                if (sh0Var.o0 && j3 == sh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j3 == sh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == sh0Var.L) {
                m4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == sh0Var.P) {
                m4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == sh0Var.S) {
                    m4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) view;
            g90Var.setCanEdit(j3 == sh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (sh0Var.o0 && j3 == sh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (sh0Var.d != null) {
                    g90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(sh0Var.c));
                    g90Var.d(0, null, false);
                    g90Var.b(true);
                    return;
                }
                return;
            }
            g90Var.b(!sh0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = sh0Var.e;
            if (tL_chatInviteExported2 != null) {
                g90Var.setLink(tL_chatInviteExported2.link);
                g90Var.c(tL_chatInviteExported2, j10);
                return;
            } else {
                g90Var.setLink(null);
                g90Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            g2Var.a.l(string, false);
            g2Var.b.setImageDrawable(qqVar);
            g2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    TLRPC.ChatFull chatFull = sh0Var.getMessagesController().getChatFull(j10);
                    TLRPC.Chat chat = sh0Var.getMessagesController().getChat(Long.valueOf(j10));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (i10 != sh0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) sh0Var.m0.get(i10 - sh0Var.U);
                        TLRPC.User user2 = (TLRPC.User) sh0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != sh0Var.V - 1) {
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
                        user = sh0Var.getMessagesController().getUser(Long.valueOf(j3));
                        i11 = sh0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
                    if (i10 == sh0Var.G) {
                        TLRPC.ChatFull chatFull2 = sh0Var.getMessagesController().getChatFull(j10);
                        TLRPC.Chat chat2 = sh0Var.getMessagesController().getChat(Long.valueOf(j10));
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
        int i14 = sh0Var.y;
        if (i10 < i14 || i10 >= sh0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) sh0Var.j0.get(i10 - sh0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        sh0 sh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(this.c, sh0Var, null, true, sh0Var.h);
                g90Var.setPermanent(true);
                g90Var.setDelegate(new qh0(this, g90Var));
                view = g90Var;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.m2) sh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.g2(context, 64, d6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                view = new ph0(sh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(9);
                u00Var.w = false;
                view = u00Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                view = eaVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(8, 6, this.c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.m2) sh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e9(context, d6Var2);
                break;
            default:
                FrameLayout lh0Var = new lh0(context);
                lh0Var.addView(new kh0(context), w7.y5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(sh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                lh0Var.addView(textView, w7.y5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                lh0Var.setTag(-33024);
                view = lh0Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
