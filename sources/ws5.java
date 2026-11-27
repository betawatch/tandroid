// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ws5 extends c79 {
    public final /* synthetic */ bt5 c;

    public ws5(bt5 bt5Var) {
        this.c = bt5Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        bt5 bt5Var = this.c;
        if (b == bt5Var.r1) {
            return bt5Var.l1.admin_id != yac.h(bt5Var.a).n;
        }
        if (b < bt5Var.w1 || b >= bt5Var.x1) {
            return b >= bt5Var.I1 && b < bt5Var.J1;
        }
        return true;
    }

    @Override // j79
    public final int b() {
        return this.c.M1;
    }

    @Override // j79
    public final int d(int i) {
        bt5 bt5Var = this.c;
        if (i == bt5Var.q1 || i == bt5Var.H1 || i == bt5Var.v1 || i == bt5Var.o1) {
            return 0;
        }
        if (i == bt5Var.r1) {
            return 1;
        }
        if (i >= bt5Var.I1 && i < bt5Var.J1) {
            return 1;
        }
        if (i >= bt5Var.w1 && i < bt5Var.x1) {
            return 1;
        }
        if (i == bt5Var.s1 || i == bt5Var.t1) {
            return 2;
        }
        if (i == bt5Var.B1) {
            return 3;
        }
        if (i == bt5Var.C1) {
            return 4;
        }
        if (i == bt5Var.D1) {
            return 5;
        }
        if (i == 0 || i == bt5Var.E1 || i == bt5Var.F1) {
            return 6;
        }
        if (i == bt5Var.u1) {
            return 7;
        }
        if (i == bt5Var.G1) {
            return 8;
        }
        return i == bt5Var.p1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        long j;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        bt5 bt5Var;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        String str3;
        boolean z4;
        boolean z5;
        boolean z6;
        String format;
        String a0;
        int i4 = f89Var.f;
        if (i4 == 0) {
            p55 p55Var = (p55) f89Var.a;
            bt5 bt5Var2 = this.c;
            if (i == bt5Var2.q1) {
                p55Var.setText(ob6.M0(2131748672, null));
                p55Var.setRightText(null);
                return;
            }
            if (i == bt5Var2.o1) {
                p55Var.setText(ob6.M0(2131748647, null));
                p55Var.setRightText(null);
                return;
            }
            if (i != bt5Var2.v1) {
                if (i == bt5Var2.y1) {
                    p55Var.setText(ob6.G(bt5Var2.l1.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    p55Var.setRightText(null);
                    return;
                } else {
                    if (i == bt5Var2.H1) {
                        p55Var.setText(ob6.G(bt5Var2.l1.requested, "JoinRequests", new Object[0]));
                        p55Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported = bt5Var2.l1;
            int i5 = tL_chatInviteExported.usage;
            if (i5 > 0) {
                p55Var.setText(ob6.G(i5, "PeopleJoined", new Object[0]));
            } else {
                p55Var.setText(ob6.M0(tL_chatInviteExported.subscription_pricing == null ? 2131747918 : 2131747916, null));
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c.l1;
            if (tL_chatInviteExported2.expired || tL_chatInviteExported2.revoked || (i2 = tL_chatInviteExported2.usage_limit) <= 0 || (i3 = tL_chatInviteExported2.usage) <= 0) {
                p55Var.setRightText(null);
                return;
            } else {
                p55Var.setRightText(ob6.G(i2 - i3, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i4 != 1) {
            if (i4 == 3) {
                i56 i56Var = (i56) f89Var.a;
                i56Var.d(0, null, false);
                i56Var.setLink(this.c.l1.link);
                i56Var.setRevoke(this.c.l1.revoked);
                i56Var.setPermanent(this.c.l1.permanent);
                i56Var.setCanEdit(this.c.e2);
                i56Var.b(!this.c.e2);
                return;
            }
            if (i4 != 4) {
                if (i4 == 8) {
                    xs5 xs5Var = (xs5) f89Var.a;
                    int i6 = this.c.l1.usage_limit;
                    if (i6 <= 0) {
                        xs5Var.a.setVisibility(8);
                        return;
                    } else {
                        xs5Var.a.setText(ob6.G(i6, "PeopleCanJoinViaLinkCount", new Object[0]));
                        xs5Var.a.setVisibility(0);
                        return;
                    }
                }
                if (i4 == 9) {
                    ys5 ys5Var = (ys5) f89Var.a;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c.l1;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported3.subscription_pricing;
                    int i7 = tL_chatInviteExported3.usage;
                    ys5Var.getClass();
                    if (tL_starsSubscriptionPricing2 != null) {
                        int i8 = tL_starsSubscriptionPricing2.period;
                        if (i8 == 2592000) {
                            ys5Var.b.setText(nza.b1(false, ob6.a0(null, null, 2131748646, Long.valueOf(tL_starsSubscriptionPricing2.amount)).concat(i7 > 0 ? uh9.k(i7, " x ") : ""), 0.8f, null));
                            TextView textView = ys5Var.c;
                            if (i7 == 0) {
                                a0 = ob6.M0(2131747916, null);
                            } else {
                                di0 h = di0.h();
                                double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                                bt5 bt5Var3 = ys5Var.f;
                                int i9 = bt5.h2;
                                a0 = ob6.a0(null, null, 2131748645, h.e((long) (d * uc7.s1(bt5Var3.a).k4.A3.i * i7), "USD"));
                            }
                            textView.setText(a0);
                            return;
                        }
                        String str4 = i8 == 300 ? "5min" : "min";
                        TextView textView2 = ys5Var.b;
                        Locale locale = Locale.US;
                        textView2.setText(nza.b1(false, String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str4).concat(i7 > 0 ? uh9.k(i7, " x ") : ""), 0.8f, null));
                        TextView textView3 = ys5Var.c;
                        if (i7 == 0) {
                            format = ob6.M0(2131747916, null);
                        } else {
                            di0 h2 = di0.h();
                            double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                            bt5 bt5Var4 = ys5Var.f;
                            int i10 = bt5.h2;
                            format = String.format(locale, "you get approximately %1$s %2$s", h2.e((long) (d2 * uc7.s1(bt5Var4.a).k4.A3.i * i7), "USD"), "for ".concat(str4));
                        }
                        textView3.setText(format);
                        return;
                    }
                    return;
                }
                return;
            }
            at5 at5Var = (at5) f89Var.a;
            hl.r(at5Var.x);
            at5Var.y = false;
            yob.X(at5Var.getTextView(), aob.B6, null);
            at5Var.setFixedSize(0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.c.l1;
            if (tL_chatInviteExported4.revoked) {
                at5Var.setText(ob6.M0(2131748655, null));
                return;
            }
            if (tL_chatInviteExported4.expired) {
                int i11 = tL_chatInviteExported4.usage_limit;
                if (i11 > 0 && i11 == tL_chatInviteExported4.usage) {
                    at5Var.setText(ob6.M0(2131748656, null));
                    return;
                } else {
                    at5Var.setText(ob6.M0(2131748657, null));
                    yob.X(at5Var.getTextView(), aob.p7, null);
                    return;
                }
            }
            if (tL_chatInviteExported4.expire_date <= 0) {
                at5Var.setFixedSize(-1);
                at5Var.setText(null);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            bt5 bt5Var5 = this.c;
            long j2 = (bt5Var5.c2 * 1000) + currentTimeMillis;
            long j3 = bt5Var5.l1.expire_date;
            long j4 = (j3 * 1000) - j2;
            if (j4 < 0) {
                j4 = 0;
            }
            if (j4 > 86400000) {
                at5Var.setText(ob6.a0("LinkExpiresIn", null, 2131748670, ob6.s(j3, false)));
                return;
            }
            long j5 = j4 / 1000;
            int i12 = (int) (j5 % 60);
            long j6 = j5 / 60;
            Locale locale2 = Locale.ENGLISH;
            String str5 = String.format(locale2, "%02d", Integer.valueOf((int) (j6 / 60))) + String.format(locale2, ":%02d", Integer.valueOf((int) (j6 % 60))) + String.format(locale2, ":%02d", Integer.valueOf(i12));
            at5Var.y = true;
            zz3 zz3Var = at5Var.x;
            hl.r(zz3Var);
            if (at5Var.y) {
                hl.d3(zz3Var, 500L);
            }
            at5Var.setText(ob6.a0("LinkExpiresInTime", null, 2131748669, str5));
            return;
        }
        zs5 zs5Var = (zs5) f89Var.a;
        bt5 bt5Var6 = this.c;
        if (i == bt5Var6.r1) {
            j = bt5Var6.l1.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i13 = bt5Var6.w1;
            ArrayList arrayList = bt5Var6.X1;
            int i14 = bt5Var6.z1;
            if (i14 != -1 && i >= i14) {
                arrayList = bt5Var6.Y1;
                i13 = i14;
            }
            int i15 = bt5Var6.I1;
            if (i15 != -1 && i >= i15) {
                arrayList = bt5Var6.Z1;
                i13 = i15;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i - i13);
            j = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) this.c.m1.get(Long.valueOf(j));
        TLRPC.ChatFull chatFull = this.c.n1;
        if (chatFull != null && chatFull.participants != null) {
            for (int i16 = 0; i16 < this.c.n1.participants.participants.size(); i16++) {
                if (this.c.n1.participants.participants.get(i16).user_id == j) {
                    chatParticipant = this.c.n1.participants.participants.get(i16);
                    break;
                }
            }
        }
        chatParticipant = null;
        bt5 bt5Var7 = this.c;
        if (i == bt5Var7.r1) {
            user2 = (TLRPC.User) bt5Var7.m1.get(Long.valueOf(j));
            if (user2 == null) {
                user2 = uc7.s1(this.c.a).X1(Long.valueOf(this.c.l1.admin_id));
            }
            if (user2 != null) {
                str = ob6.s(this.c.l1.date, false);
                user = user2;
                if (i != this.c.r1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str6 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = ob6.M0(2131752397, "ChannelCreator");
                            }
                            str3 = str6;
                            z4 = false;
                            z5 = true;
                            z6 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = ob6.M0(2131752495, "ChannelAdmin");
                            }
                            z4 = channelParticipant.promoted_by == yac.h(this.c.a).e();
                            str3 = str6;
                            z6 = false;
                            z5 = true;
                        } else {
                            str3 = str6;
                            z4 = false;
                            z5 = false;
                            z6 = false;
                        }
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str2 = str3;
                    } else {
                        String str7 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str7)) {
                                str7 = ob6.M0(2131752397, "ChannelCreator");
                            }
                            str2 = str7;
                            z = false;
                            z2 = true;
                            z3 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str7)) {
                                str7 = ob6.M0(2131752495, "ChannelAdmin");
                            }
                            String str8 = str7;
                            z = chatParticipant.inviter_id == yac.h(this.c.a).e();
                            str2 = str8;
                            z3 = false;
                            z2 = true;
                        } else {
                            str2 = str7;
                        }
                    }
                    zs5Var.a(str2, z2, z3, !lbc.D(user) && xc2.h(uc7.s1(this.c.a).M0(Long.valueOf(this.c.a2))), new rs5(this, user, str2, z2, z3, z, (byte) 0));
                    zs5Var.d(user, null, str, false);
                    bt5Var = this.c;
                    if (i == bt5Var.r1 || (tL_starsSubscriptionPricing = bt5Var.l1.subscription_pricing) == null || tL_chatInviteImporter == null) {
                        return;
                    }
                    int i17 = tL_chatInviteImporter.date;
                    TextView textView4 = zs5Var.d0;
                    TextView textView5 = zs5Var.c0;
                    SpannableStringBuilder b1 = nza.b1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                    int i18 = tL_starsSubscriptionPricing.period;
                    String M0 = i18 == 2592000 ? ob6.M0(2131744713, null) : i18 == 300 ? "per 5 minutes" : "per each minute";
                    textView5.setText(b1);
                    textView4.setText(M0);
                    zs5Var.h((int) Math.max(kg5.h(b1, textView5.getPaint()), kg5.h(M0, textView4.getPaint())), true);
                    zs5Var.c.l(ob6.B(i17), false);
                    return;
                }
                str2 = null;
                z = false;
                z2 = false;
                z3 = false;
                zs5Var.a(str2, z2, z3, !lbc.D(user) && xc2.h(uc7.s1(this.c.a).M0(Long.valueOf(this.c.a2))), new rs5(this, user, str2, z2, z3, z, (byte) 0));
                zs5Var.d(user, null, str, false);
                bt5Var = this.c;
                if (i == bt5Var.r1) {
                    return;
                } else {
                    return;
                }
            }
        }
        user = user2;
        str = null;
        if (i != this.c.r1) {
        }
        str2 = null;
        z = false;
        z2 = false;
        z3 = false;
        zs5Var.a(str2, z2, z3, !lbc.D(user) && xc2.h(uc7.s1(this.c.a).M0(Long.valueOf(this.c.a2))), new rs5(this, user, str2, z2, z3, z, (byte) 0));
        zs5Var.d(user, null, str, false);
        bt5Var = this.c;
        if (i == bt5Var.r1) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        byte b = 10;
        bt5 bt5Var = this.c;
        switch (i) {
            case 1:
                view2 = new zs5(context);
                break;
            case 2:
                int i2 = aob.a7;
                View rcaVar = new rca(context, aob.w0(null, i2, false), 0);
                yob.h(i2, null, rcaVar);
                view2 = rcaVar;
                break;
            case 3:
                ss5 ss5Var = new ss5(this, context, bt5Var.O1, bt5Var, bt5Var.b2);
                ss5Var.setDelegate(new vs5(this));
                ss5Var.setLayoutParams(new r79(-1, -2));
                view2 = ss5Var;
                break;
            case 4:
                view2 = new at5(bt5Var, context);
                break;
            case 5:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(10);
                tk4Var.x = false;
                tk4Var.setPaddingLeft(hl.L(10.0f));
                view = tk4Var;
                view2 = view;
                break;
            case 6:
                view = new t62(context, b);
                view2 = view;
                break;
            case 7:
                view2 = new rca(context, (uh9) null);
                break;
            case 8:
                xs5 xs5Var = new xs5(context);
                TextView textView = new TextView(context);
                xs5Var.a = textView;
                textView.setTextSize(1, 14.0f);
                yob.X(textView, aob.y6, null);
                textView.setGravity(1);
                xs5Var.addView(textView, tre.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = xs5Var;
                break;
            case 9:
                view2 = new ys5(bt5Var, context);
                break;
            default:
                view2 = new p55(context, bt5Var.J0);
                break;
        }
        return qu6.h(view2, view2, -1, -2);
    }
}
