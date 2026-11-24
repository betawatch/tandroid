// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zj6 extends q59 {
    public final Context c;
    public final /* synthetic */ ak6 d;

    public zj6(ak6 ak6Var, Context context) {
        this.d = ak6Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        ak6 ak6Var = this.d;
        if (ak6Var.R == b || ak6Var.y == b) {
            return true;
        }
        if (b >= ak6Var.E && b < ak6Var.F) {
            return true;
        }
        if ((b < ak6Var.I || b >= ak6Var.J) && b != ak6Var.O) {
            return b >= ak6Var.V && b < ak6Var.W;
        }
        return true;
    }

    @Override // y59
    public final int b() {
        return this.d.Y;
    }

    @Override // y59
    public final int d(int i) {
        ak6 ak6Var = this.d;
        if (i == ak6Var.r) {
            return 0;
        }
        if (i == ak6Var.s || i == ak6Var.M || i == ak6Var.T || i == ak6Var.Q) {
            return 1;
        }
        if (i == ak6Var.w) {
            return 2;
        }
        if (i == ak6Var.y) {
            return 3;
        }
        if (i == ak6Var.x || i == ak6Var.K || i == ak6Var.N || i == ak6Var.S || i == ak6Var.U) {
            return 4;
        }
        if (i >= ak6Var.E && i < ak6Var.F) {
            return 5;
        }
        if (i >= ak6Var.I && i < ak6Var.J) {
            return 5;
        }
        if (i == ak6Var.G) {
            return 6;
        }
        if (i == ak6Var.L) {
            return 7;
        }
        if (i == ak6Var.O) {
            return 8;
        }
        if (i == ak6Var.P) {
            return 9;
        }
        if (i == ak6Var.R) {
            return 10;
        }
        if (i < ak6Var.V || i >= ak6Var.W) {
            return i == ak6Var.H ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r15 == (r0.F - 1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (r15 == (r0.J - 1)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i2;
        TLRPC.User user;
        ak6 ak6Var = this.d;
        ArrayList arrayList = ak6Var.j0;
        long j = ak6Var.f;
        long j2 = ak6Var.n;
        int i3 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        if (i3 == 1) {
            jf5 jf5Var = (jf5) view;
            if (i == ak6Var.s) {
                if (ak6Var.p0 && j == z8c.h(ak6Var.getAccountInstance().a).n) {
                    jf5Var.setText(jb6.M0(2131746324, null));
                    return;
                } else if (j == z8c.h(ak6Var.getAccountInstance().a).n) {
                    jf5Var.setText(jb6.M0(2131752347, null));
                    return;
                } else {
                    jf5Var.setText(jb6.M0(2131747053, null));
                    return;
                }
            }
            if (i == ak6Var.M) {
                jf5Var.setText(jb6.M0(2131745746, null));
                return;
            } else if (i == ak6Var.Q) {
                jf5Var.setText(jb6.M0(2131748637, null));
                return;
            } else {
                if (i == ak6Var.T) {
                    jf5Var.setText(jb6.M0(2131748638, null));
                    return;
                }
                return;
            }
        }
        if (i3 == 2) {
            f56 f56Var = (f56) view;
            f56Var.setCanEdit(j == z8c.h(ak6Var.getAccountInstance().a).n);
            if (ak6Var.p0 && j == z8c.h(ak6Var.getAccountInstance().a).n) {
                if (ak6Var.d != null) {
                    f56Var.setLink("https://t.me/" + sd2.K(ak6Var.c, false));
                    f56Var.d(0, null, false);
                    f56Var.b(true);
                    return;
                }
                return;
            }
            f56Var.b(!ak6Var.q0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ak6Var.e;
            if (tL_chatInviteExported2 != null) {
                f56Var.setLink(tL_chatInviteExported2.link);
                f56Var.c(tL_chatInviteExported2, j2);
                return;
            } else {
                f56Var.setLink(null);
                f56Var.d(0, null, false);
                return;
            }
        }
        if (i3 == 3) {
            y23 y23Var = (y23) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i4 = cmb.M6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.x(y23Var, drawable, i4, null, mode);
            anb.x(y23Var, drawable2, cmb.j7, null, mode);
            sn2 sn2Var = new sn2(drawable, drawable2);
            String M0 = jb6.M0(2131751650, null);
            boolean z2 = !arrayList.isEmpty();
            y23Var.a.l(M0, false);
            y23Var.b.setImageDrawable(sn2Var);
            y23Var.c = z2;
            return;
        }
        if (i3 == 5) {
            int i5 = ak6Var.E;
            if (i < i5 || i >= ak6Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ak6Var.k0.get(i - ak6Var.I);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i - i5);
            }
            xj6 xj6Var = (xj6) view;
            xj6Var.b(tL_chatInviteExported, i - ak6Var.E);
            xj6Var.I = z;
            return;
        }
        switch (i3) {
            case 9:
                njb njbVar = (njb) view;
                TLRPC.ChatFull M02 = ak6Var.getMessagesController().M0(j2);
                TLRPC.Chat L0 = ak6Var.getMessagesController().L0(Long.valueOf(j2));
                if (M02 == null || !M02.paid_media_allowed || !sd2.V(L0)) {
                    njbVar.setText(jb6.M0(2131752328, null));
                    break;
                } else {
                    njbVar.setText(jb6.M0(2131752327, null));
                    break;
                }
                break;
            case 10:
                ij6 ij6Var = (ij6) view;
                if (i != ak6Var.R) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ak6Var.n0.get(i - ak6Var.V);
                    TLRPC.User user2 = (TLRPC.User) ak6Var.l0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                    int i6 = tL_chatAdminWithInvites.invites_count;
                    if (i != ak6Var.W - 1) {
                        i2 = i6;
                        user = user2;
                        if (user == null) {
                            ij6Var.c(user, bw2.m(0, user.first_name, user.last_name), jb6.G(i2, "InviteLinkCount", new Object[0]), z);
                            break;
                        }
                    } else {
                        i2 = i6;
                        user = user2;
                    }
                } else {
                    user = ak6Var.getMessagesController().W1(Long.valueOf(j));
                    i2 = ak6Var.g0;
                }
                z = false;
                if (user == null) {
                }
                break;
            case 11:
                njb njbVar2 = (njb) view;
                if (i == ak6Var.H) {
                    TLRPC.ChatFull M03 = ak6Var.getMessagesController().M0(j2);
                    TLRPC.Chat L02 = ak6Var.getMessagesController().L0(Long.valueOf(j2));
                    if (M03 == null || !M03.paid_media_allowed || !sd2.V(L02)) {
                        njbVar2.setText(jb6.M0(2131752328, null));
                        break;
                    } else {
                        njbVar2.setText(jb6.M0(2131752327, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        ylb ylbVar;
        ylb ylbVar2;
        ak6 ak6Var = this.d;
        Context context = this.c;
        switch (i) {
            case 1:
                view = new jf5(context, 23);
                break;
            case 2:
                f56 f56Var = new f56(this.c, ak6Var, null, true, ak6Var.h);
                f56Var.setPermanent(true);
                f56Var.setDelegate(new yj6(this, f56Var));
                view = f56Var;
                break;
            case 3:
                ylbVar = ((d) ak6Var).resourceProvider;
                view = new y23(64, ylbVar, context);
                break;
            case 4:
                view = new bba(context, (hg9) null);
                break;
            case 5:
                view = new xj6(ak6Var, context);
                break;
            case 6:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(9);
                tk4Var.x = false;
                view = tk4Var;
                break;
            case 7:
                view = new bba(context, (hg9) null);
                break;
            case 8:
                vkb vkbVar = new vkb(context);
                vkbVar.b(jb6.M0(2131751512, null), false);
                anb.X(vkbVar.getTextView(), cmb.o7, null);
                view = vkbVar;
                break;
            case 9:
                view = new njb(context);
                break;
            case 10:
                view = new ij6(this.c, 8, 6, false, null);
                break;
            case 11:
                ylbVar2 = ((d) ak6Var).resourceProvider;
                view = new njb(context, ylbVar2);
                break;
            default:
                FrameLayout a6Var = new a6(context, (byte) 19);
                a6Var.addView(new tj6(context), qoe.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                anb.X(textView, cmb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(jb6.M0(ak6Var.h ? 2131746605 : 2131746606, null));
                a6Var.addView(textView, qoe.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                a6Var.setTag(-33024);
                view = a6Var;
                break;
        }
        return kt6.h(view, view, -1, -2);
    }
}
