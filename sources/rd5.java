// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rd5 extends c79 {
    public final Context c;
    public final sv9 d;
    public pd5 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ sd5 x;

    public rd5(sd5 sd5Var, Context context) {
        this.x = sd5Var;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.d = sv9Var;
        sv9Var.a = new qd5(this);
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        View view = f89Var.a;
        return !((view instanceof lj6) && this.x.Z1.contains(Long.valueOf(((lj6) view).getUserId()))) && f89Var.f == 0;
    }

    @Override // j79
    public final int b() {
        return this.f;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == this.r) {
            return 3;
        }
        return (i == this.w || i == this.s) ? 1 : 0;
    }

    @Override // j79
    public final void f() {
        this.f = 1;
        sv9 sv9Var = this.d;
        int size = sv9Var.g.size();
        if (size != 0) {
            int i = this.f;
            this.s = i;
            this.f = size + 1 + i;
        } else {
            this.s = -1;
        }
        int size2 = sv9Var.e.size();
        if (size2 != 0) {
            int i2 = this.f;
            this.w = i2;
            this.f = size2 + 1 + i2;
        } else {
            this.w = -1;
        }
        int i3 = this.f;
        this.f = i3 + 1;
        this.r = i3;
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TLObject tLObject;
        boolean z;
        TLRPC.User X1;
        int size;
        String str;
        boolean z2;
        int size2;
        sv9 sv9Var = this.d;
        ArrayList arrayList = sv9Var.e;
        ArrayList arrayList2 = sv9Var.g;
        int i2 = f89Var.f;
        View view = f89Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i2 != 0) {
            if (i2 == 1) {
                p55 p55Var = (p55) view;
                if (i == this.s) {
                    p55Var.setText(ob6.M0(2131752349, null));
                    return;
                } else {
                    if (i == this.w) {
                        p55Var.setText(ob6.M0(2131749306, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i3 = this.s;
        if (i3 >= 0 && i > i3) {
            if (i < arrayList2.size() + i3 + 1) {
                tLObject = (TLObject) arrayList2.get((i - this.s) - 1);
                z = tLObject instanceof TLRPC.User;
                sd5 sd5Var = this.x;
                if (z) {
                    X1 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    X1 = uc7.s1(sd5Var.a).X1(Long.valueOf(r47.B1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    X1 = uc7.s1(sd5Var.a).X1(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String p = lbc.p(X1);
                size = arrayList2.size();
                if (size != 0) {
                    int i4 = size + 1;
                    if (i4 > i) {
                        str = sv9Var.n;
                        z2 = true;
                        if (!z2 || p == null || (size2 = arrayList.size()) == 0 || size2 + 1 <= i) {
                            p = null;
                        } else {
                            String str2 = sv9Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) p);
                                int y1 = hl.y1(p, str2);
                                if (y1 != -1) {
                                    int length = str2.length();
                                    if (y1 == 0) {
                                        length++;
                                    } else {
                                        y1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(aob.w0(null, aob.gh, false)), y1, length + y1, 33);
                                }
                                p = spannableStringBuilder2;
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        }
                        if (str != null) {
                            String r = lbc.r(X1);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(r);
                            int y12 = hl.y1(r, str);
                            if (y12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(aob.w0(null, aob.gh, false)), y12, str.length() + y12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        lj6 lj6Var = (lj6) view;
                        lj6Var.setTag(Integer.valueOf(i));
                        lj6Var.setCustomImageVisible(sd5Var.Z1.contains(Long.valueOf(X1.id)));
                        lj6Var.c(X1, spannableStringBuilder, p, false);
                    }
                    i -= i4;
                }
                str = null;
                z2 = false;
                if (z2) {
                }
                p = null;
                if (str != null) {
                }
                lj6 lj6Var2 = (lj6) view;
                lj6Var2.setTag(Integer.valueOf(i));
                lj6Var2.setCustomImageVisible(sd5Var.Z1.contains(Long.valueOf(X1.id)));
                lj6Var2.c(X1, spannableStringBuilder, p, false);
            }
        }
        int i5 = this.w;
        if (i5 >= 0 && i > i5) {
            if (i < arrayList.size() + i5 + 1) {
                tLObject = (TLObject) arrayList.get((i - this.w) - 1);
                z = tLObject instanceof TLRPC.User;
                sd5 sd5Var2 = this.x;
                if (z) {
                }
                String p2 = lbc.p(X1);
                size = arrayList2.size();
                if (size != 0) {
                }
                str = null;
                z2 = false;
                if (z2) {
                }
                p2 = null;
                if (str != null) {
                }
                lj6 lj6Var22 = (lj6) view;
                lj6Var22.setTag(Integer.valueOf(i));
                lj6Var22.setCustomImageVisible(sd5Var2.Z1.contains(Long.valueOf(X1.id)));
                lj6Var22.c(X1, spannableStringBuilder, p2, false);
            }
        }
        tLObject = null;
        z = tLObject instanceof TLRPC.User;
        sd5 sd5Var22 = this.x;
        if (z) {
        }
        String p22 = lbc.p(X1);
        size = arrayList2.size();
        if (size != 0) {
        }
        str = null;
        z2 = false;
        if (z2) {
        }
        p22 = null;
        if (str != null) {
        }
        lj6 lj6Var222 = (lj6) view;
        lj6Var222.setTag(Integer.valueOf(i));
        lj6Var222.setCustomImageVisible(sd5Var22.Z1.contains(Long.valueOf(X1.id)));
        lj6Var222.c(X1, spannableStringBuilder, p22, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, p55] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        lj6 lj6Var;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ?? p55Var = new p55(context, null);
                yob.h(aob.ah, null, p55Var);
                p55Var.setTextColor(aob.Hh);
                lj6Var = p55Var;
            } else if (i != 2) {
                lj6Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new r79(-1, hl.L(56.0f)));
                lj6Var = view;
            }
        } else {
            lj6 lj6Var2 = new lj6(this.c, 2, 2, false, null);
            lj6Var2.setCustomRightImage(R.drawable.msg_invited);
            lj6Var2.setNameColor(aob.w0(null, aob.eh, false));
            int w0 = aob.w0(null, aob.ch, false);
            int w02 = aob.w0(null, aob.gh, false);
            lj6Var2.P = true;
            lj6Var2.I = w0;
            lj6Var2.J = w02;
            lj6Var2.setDividerColor(aob.kh);
            lj6Var = lj6Var2;
        }
        return new n69(lj6Var);
    }
}
