// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.PollVotesAlert$UserCell;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qi8 extends y69 {
    public final Context r;
    public final /* synthetic */ ui8 s;

    public qi8(ui8 ui8Var, Context context) {
        this.s = ui8Var;
        this.r = context;
    }

    @Override // l69
    public final String F(int i) {
        return null;
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // y69
    public final int M(int i) {
        int i2 = 1;
        if (i == 0) {
            return 1;
        }
        ti8 ti8Var = (ti8) this.s.w1.get(i - 1);
        int b = ti8Var.b() + 1;
        if (TextUtils.isEmpty(ti8Var.c) && !ti8Var.e) {
            i2 = 0;
        }
        return b + i2;
    }

    @Override // y69
    public final Object O(int i, int i2) {
        int i3;
        ArrayList arrayList = this.s.w1;
        if (i == 0) {
            return 293145;
        }
        int i4 = i - 1;
        if (i2 == 0) {
            return -928312;
        }
        if (i4 < 0 || i4 >= arrayList.size() || (i3 = i2 - 1) >= ((ti8) arrayList.get(i4)).b()) {
            return -182734;
        }
        return Integer.valueOf(Objects.hash(Long.valueOf(wf3.n(((TLRPC.MessagePeerVote) ((ti8) arrayList.get(i4)).b.get(i3)).peer))));
    }

    @Override // y69
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i2 == 0) {
            return 2;
        }
        return i2 + (-1) < ((ti8) this.s.w1.get(i + (-1))).b() ? 0 : 3;
    }

    @Override // y69
    public final int R() {
        return this.s.w1.size() + 1;
    }

    @Override // y69
    public final View T(int i, View view) {
        ArrayList<TLRPC.MessageEntity> arrayList;
        String str;
        TLRPC.Message message;
        ui8 ui8Var = this.s;
        TLRPC.Poll poll = ui8Var.s1;
        r47 r47Var = ui8Var.r1;
        if (view == null) {
            view = new pi8(this, this.r);
        }
        si8 si8Var = (si8) view;
        if (i == 0) {
            si8Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ti8 ti8Var = (ti8) ui8Var.w1.get(i - 1);
        int size = poll.answers.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
            if (Arrays.equals(pollAnswer.option, ti8Var.d) && ((ri8) ui8Var.v1.get(ti8Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (r47Var != null && r47Var.L2 && (message = r47Var.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i2 >= r47Var.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) r47Var.k.translatedPoll.b.get(i2);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i2++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                    arrayList = null;
                } else {
                    String str2 = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                    str = str2;
                }
                si8Var.a(str, arrayList, ui8Var.F0(ti8Var.d), ti8Var.a, ti8Var.a(), false);
                si8Var.setTag(R.id.object_tag, ti8Var);
                return view;
            }
        }
        return view;
    }

    @Override // y69
    public final boolean V(int i, int i2, f89 f89Var) {
        if (i == 0 || i2 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.z1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // y69
    public final void W(int i, int i2, f89 f89Var) {
        ArrayList<TLRPC.MessageEntity> arrayList;
        String str;
        TLRPC.Message message;
        ui8 ui8Var = this.s;
        TLRPC.Poll poll = ui8Var.s1;
        ArrayList arrayList2 = ui8Var.w1;
        r47 r47Var = ui8Var.r1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        int i4 = 0;
        if (i3 != 2) {
            if (i3 == 3) {
                ti8 ti8Var = (ti8) arrayList2.get(i - 1);
                ((skb) view).o(R.drawable.arrow_more, ob6.G(ti8Var.a - ti8Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        si8 si8Var = (si8) view;
        ti8 ti8Var2 = (ti8) arrayList2.get(i - 1);
        ArrayList arrayList3 = ti8Var2.b;
        byte[] bArr = ti8Var2.d;
        int size = poll.answers.size();
        for (int i5 = 0; i5 < size; i5++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i5);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ri8) ui8Var.v1.get(ti8Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (r47Var != null && r47Var.L2 && (message = r47Var.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i4 >= r47Var.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) r47Var.k.translatedPoll.b.get(i4);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i4++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                    arrayList = null;
                } else {
                    String str2 = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                    str = str2;
                }
                si8Var.a(str, arrayList, ui8Var.F0(bArr), ti8Var2.a, ti8Var2.a(), false);
                si8Var.setTag(R.id.object_tag, ti8Var2);
                return;
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        ui8 ui8Var = this.s;
        View view2 = ui8Var.x1;
        Context context = this.r;
        if (i == 0) {
            view = new PollVotesAlert$UserCell(ui8Var, context);
        } else if (i == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i != 2) {
            skb skbVar = new skb(23, context, true);
            skbVar.setOffsetFromImage(65);
            yob.h(aob.h5, ui8Var.J0, skbVar);
            skbVar.g(aob.N6, aob.q6);
            view = skbVar;
        } else {
            View pi8Var = new pi8(this, context);
            pi8Var.setTag(-33024);
            view = pi8Var;
        }
        return new n69(view);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        if (f89Var.f == 0) {
            int b = f89Var.b();
            int S = S(b);
            int Q = Q(b) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) f89Var.a;
            ui8 ui8Var = this.s;
            ti8 ti8Var = (ti8) ui8Var.w1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ti8Var.b.get(Q);
            TLObject b2 = uc7.s1(ui8Var.a).b2(wf3.n(messagePeerVote.peer));
            int i = messagePeerVote.date;
            boolean z = (Q == ti8Var.b() - 1 && TextUtils.isEmpty(ti8Var.c) && !ti8Var.e) ? false : true;
            de0 de0Var = pollVotesAlert$UserCell.a;
            ema emaVar = pollVotesAlert$UserCell.b;
            if (b2 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) b2;
                pollVotesAlert$UserCell.n = null;
            } else if (b2 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) b2;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j = i;
            pollVotesAlert$UserCell.d.setText(ob6.D0().o0().format(1000 * j));
            pollVotesAlert$UserCell.c.setText(ob6.r(j, true));
            pollVotesAlert$UserCell.s = z;
            pollVotesAlert$UserCell.x = b2 == null;
            pollVotesAlert$UserCell.w = Q;
            if (b2 == null) {
                emaVar.l("", false);
                de0Var.setImageDrawable(null);
            } else {
                rb0 rb0Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if (user != null) {
                    rb0Var.q(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat = pollVotesAlert$UserCell.n;
                    if (chat != null) {
                        rb0Var.p(chat);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String r = lbc.r(user2);
                    pollVotesAlert$UserCell.r = r;
                    pollVotesAlert$UserCell.r = c00.f(emaVar, r, false, null, 0);
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        String str = chat2.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = c00.f(emaVar, str, false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                emaVar.l(pollVotesAlert$UserCell.r, false);
                c2b c2bVar = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                int i2 = aob.z9;
                ui8 ui8Var2 = pollVotesAlert$UserCell.F;
                qm qmVar = ui8.L1;
                emaVar.i(c2bVar.b(user3, chat3, aob.v0(i2, ui8Var2.J0), false));
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                if (chat4 != null) {
                    de0Var.f(chat4, rb0Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        de0Var.f(user4, rb0Var);
                    } else {
                        de0Var.setImageDrawable(rb0Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList == null) {
                if (pollVotesAlert$UserCell.x) {
                    return;
                }
                pollVotesAlert$UserCell.y = 0.0f;
            } else {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(de0Var, (Property<de0, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ui8.L1, 1.0f, 0.0f));
            }
        }
    }
}
