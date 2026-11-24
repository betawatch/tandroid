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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xh6 extends n39 {
    public final Context c;
    public final /* synthetic */ yh6 d;

    public xh6(yh6 yh6Var, Context context) {
        this.d = yh6Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        yh6 yh6Var = this.d;
        if (yh6Var.R == b || yh6Var.y == b) {
            return true;
        }
        if (b >= yh6Var.E && b < yh6Var.F) {
            return true;
        }
        if ((b < yh6Var.I || b >= yh6Var.J) && b != yh6Var.O) {
            return b >= yh6Var.V && b < yh6Var.W;
        }
        return true;
    }

    @Override // w39
    public final int b() {
        return this.d.Y;
    }

    @Override // w39
    public final int d(int i) {
        yh6 yh6Var = this.d;
        if (i == yh6Var.r) {
            return 0;
        }
        if (i == yh6Var.s || i == yh6Var.M || i == yh6Var.T || i == yh6Var.Q) {
            return 1;
        }
        if (i == yh6Var.w) {
            return 2;
        }
        if (i == yh6Var.y) {
            return 3;
        }
        if (i == yh6Var.x || i == yh6Var.K || i == yh6Var.N || i == yh6Var.S || i == yh6Var.U) {
            return 4;
        }
        if (i >= yh6Var.E && i < yh6Var.F) {
            return 5;
        }
        if (i >= yh6Var.I && i < yh6Var.J) {
            return 5;
        }
        if (i == yh6Var.G) {
            return 6;
        }
        if (i == yh6Var.L) {
            return 7;
        }
        if (i == yh6Var.O) {
            return 8;
        }
        if (i == yh6Var.P) {
            return 9;
        }
        if (i == yh6Var.R) {
            return 10;
        }
        if (i < yh6Var.V || i >= yh6Var.W) {
            return i == yh6Var.H ? 11 : 1;
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i2;
        TLRPC.User user;
        yh6 yh6Var = this.d;
        ArrayList arrayList = yh6Var.j0;
        long j = yh6Var.f;
        long j2 = yh6Var.n;
        int i3 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        if (i3 == 1) {
            ld5 ld5Var = (ld5) view;
            if (i == yh6Var.s) {
                if (yh6Var.p0 && j == y6c.h(yh6Var.getAccountInstance().a).n) {
                    ld5Var.setText(k96.M0(2131746398, null));
                    return;
                } else if (j == y6c.h(yh6Var.getAccountInstance().a).n) {
                    ld5Var.setText(k96.M0(2131752391, null));
                    return;
                } else {
                    ld5Var.setText(k96.M0(2131747127, null));
                    return;
                }
            }
            if (i == yh6Var.M) {
                ld5Var.setText(k96.M0(2131745820, null));
                return;
            } else if (i == yh6Var.Q) {
                ld5Var.setText(k96.M0(2131748688, null));
                return;
            } else {
                if (i == yh6Var.T) {
                    ld5Var.setText(k96.M0(2131748689, null));
                    return;
                }
                return;
            }
        }
        if (i3 == 2) {
            f36 f36Var = (f36) view;
            f36Var.setCanEdit(j == y6c.h(yh6Var.getAccountInstance().a).n);
            if (yh6Var.p0 && j == y6c.h(yh6Var.getAccountInstance().a).n) {
                if (yh6Var.d != null) {
                    f36Var.setLink("https://t.me/" + hc2.K(yh6Var.c, false));
                    f36Var.d(0, null, false);
                    f36Var.b(true);
                    return;
                }
                return;
            }
            f36Var.b(!yh6Var.q0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yh6Var.e;
            if (tL_chatInviteExported2 != null) {
                f36Var.setLink(tL_chatInviteExported2.link);
                f36Var.c(tL_chatInviteExported2, j2);
                return;
            } else {
                f36Var.setLink(null);
                f36Var.d(0, null, false);
                return;
            }
        }
        if (i3 == 3) {
            m13 m13Var = (m13) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i4 = bkb.M6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.x(m13Var, drawable, i4, null, mode);
            zkb.x(m13Var, drawable2, bkb.j7, null, mode);
            fm2 fm2Var = new fm2(drawable, drawable2);
            String M0 = k96.M0(2131751701, null);
            boolean z2 = !arrayList.isEmpty();
            m13Var.a.l(M0, false);
            m13Var.b.setImageDrawable(fm2Var);
            m13Var.c = z2;
            return;
        }
        if (i3 == 5) {
            int i5 = yh6Var.E;
            if (i < i5 || i >= yh6Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh6Var.k0.get(i - yh6Var.I);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i - i5);
            }
            vh6 vh6Var = (vh6) view;
            vh6Var.b(tL_chatInviteExported, i - yh6Var.E);
            vh6Var.I = z;
            return;
        }
        switch (i3) {
            case 9:
                mhb mhbVar = (mhb) view;
                TLRPC.ChatFull L0 = yh6Var.getMessagesController().L0(j2);
                TLRPC.Chat K0 = yh6Var.getMessagesController().K0(Long.valueOf(j2));
                if (L0 == null || !L0.paid_media_allowed || !hc2.V(K0)) {
                    mhbVar.setText(k96.M0(2131752372, null));
                    break;
                } else {
                    mhbVar.setText(k96.M0(2131752371, null));
                    break;
                }
                break;
            case 10:
                gh6 gh6Var = (gh6) view;
                if (i != yh6Var.R) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) yh6Var.n0.get(i - yh6Var.V);
                    TLRPC.User user2 = (TLRPC.User) yh6Var.l0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                    int i6 = tL_chatAdminWithInvites.invites_count;
                    if (i != yh6Var.W - 1) {
                        i2 = i6;
                        user = user2;
                        if (user == null) {
                            gh6Var.c(user, qu2.m(0, user.first_name, user.last_name), k96.G(i2, "InviteLinkCount", new Object[0]), z);
                            break;
                        }
                    } else {
                        i2 = i6;
                        user = user2;
                    }
                } else {
                    user = yh6Var.getMessagesController().V1(Long.valueOf(j));
                    i2 = yh6Var.g0;
                }
                z = false;
                if (user == null) {
                }
                break;
            case 11:
                mhb mhbVar2 = (mhb) view;
                if (i == yh6Var.H) {
                    TLRPC.ChatFull L02 = yh6Var.getMessagesController().L0(j2);
                    TLRPC.Chat K02 = yh6Var.getMessagesController().K0(Long.valueOf(j2));
                    if (L02 == null || !L02.paid_media_allowed || !hc2.V(K02)) {
                        mhbVar2.setText(k96.M0(2131752372, null));
                        break;
                    } else {
                        mhbVar2.setText(k96.M0(2131752371, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        wjb wjbVar;
        wjb wjbVar2;
        yh6 yh6Var = this.d;
        Context context = this.c;
        switch (i) {
            case 1:
                view = new ld5(context, 23);
                break;
            case 2:
                f36 f36Var = new f36(this.c, yh6Var, null, true, yh6Var.h);
                f36Var.setPermanent(true);
                f36Var.setDelegate(new wh6(this, f36Var));
                view = f36Var;
                break;
            case 3:
                wjbVar = ((d) yh6Var).resourceProvider;
                view = new m13(64, wjbVar, context);
                break;
            case 4:
                view = new b9a(context, (de9) null);
                break;
            case 5:
                view = new vh6(yh6Var, context);
                break;
            case 6:
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(9);
                pi4Var.x = false;
                view = pi4Var;
                break;
            case 7:
                view = new b9a(context, (de9) null);
                break;
            case 8:
                uib uibVar = new uib(context);
                uibVar.b(k96.M0(2131751563, null), false);
                zkb.X(uibVar.getTextView(), bkb.o7, null);
                view = uibVar;
                break;
            case 9:
                view = new mhb(context);
                break;
            case 10:
                view = new gh6(this.c, 8, 6, false, null);
                break;
            case 11:
                wjbVar2 = ((d) yh6Var).resourceProvider;
                view = new mhb(context, wjbVar2);
                break;
            default:
                FrameLayout a6Var = new a6(context, (byte) 19);
                a6Var.addView(new rh6(context), nme.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                zkb.X(textView, bkb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(k96.M0(yh6Var.h ? 2131746679 : 2131746680, null));
                a6Var.addView(textView, nme.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                a6Var.setTag(-33024);
                view = a6Var;
                break;
        }
        return ls6.h(view, view, -1, -2);
    }
}
