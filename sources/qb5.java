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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qb5 extends n39 {
    public final Context c;
    public final zr9 d;
    public ob5 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ rb5 x;

    public qb5(rb5 rb5Var, Context context) {
        this.x = rb5Var;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.d = zr9Var;
        zr9Var.a = new pb5(this);
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
        View view = s49Var.a;
        return !((view instanceof gh6) && this.x.Z1.contains(Long.valueOf(((gh6) view).getUserId()))) && s49Var.f == 0;
    }

    @Override // w39
    public final int b() {
        return this.f;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == this.r) {
            return 3;
        }
        return (i == this.w || i == this.s) ? 1 : 0;
    }

    @Override // w39
    public final void f() {
        this.f = 1;
        zr9 zr9Var = this.d;
        int size = zr9Var.g.size();
        if (size != 0) {
            int i = this.f;
            this.s = i;
            this.f = size + 1 + i;
        } else {
            this.s = -1;
        }
        int size2 = zr9Var.e.size();
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TLObject tLObject;
        boolean z;
        TLRPC.User V1;
        int size;
        String str;
        boolean z2;
        int size2;
        zr9 zr9Var = this.d;
        ArrayList arrayList = zr9Var.e;
        ArrayList arrayList2 = zr9Var.g;
        int i2 = s49Var.f;
        View view = s49Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i2 != 0) {
            if (i2 == 1) {
                l35 l35Var = (l35) view;
                if (i == this.s) {
                    l35Var.setText(k96.M0(2131752365, null));
                    return;
                } else {
                    if (i == this.w) {
                        l35Var.setText(k96.M0(2131749360, null));
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
                rb5 rb5Var = this.x;
                if (z) {
                    V1 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    V1 = na7.q1(rb5Var.a).V1(Long.valueOf(k27.B1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    V1 = na7.q1(rb5Var.a).V1(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String o = l7c.o(V1);
                size = arrayList2.size();
                if (size != 0) {
                    int i4 = size + 1;
                    if (i4 > i) {
                        str = zr9Var.n;
                        z2 = true;
                        if (!z2 || o == null || (size2 = arrayList.size()) == 0 || size2 + 1 <= i) {
                            o = null;
                        } else {
                            String str2 = zr9Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) o);
                                int y1 = gl.y1(o, str2);
                                if (y1 != -1) {
                                    int length = str2.length();
                                    if (y1 == 0) {
                                        length++;
                                    } else {
                                        y1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(bkb.w0(null, bkb.fh, false)), y1, length + y1, 33);
                                }
                                o = spannableStringBuilder2;
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        }
                        if (str != null) {
                            String q = l7c.q(V1);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(q);
                            int y12 = gl.y1(q, str);
                            if (y12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(bkb.w0(null, bkb.fh, false)), y12, str.length() + y12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        gh6 gh6Var = (gh6) view;
                        gh6Var.setTag(Integer.valueOf(i));
                        gh6Var.setCustomImageVisible(rb5Var.Z1.contains(Long.valueOf(V1.id)));
                        gh6Var.c(V1, spannableStringBuilder, o, false);
                    }
                    i -= i4;
                }
                str = null;
                z2 = false;
                if (z2) {
                }
                o = null;
                if (str != null) {
                }
                gh6 gh6Var2 = (gh6) view;
                gh6Var2.setTag(Integer.valueOf(i));
                gh6Var2.setCustomImageVisible(rb5Var.Z1.contains(Long.valueOf(V1.id)));
                gh6Var2.c(V1, spannableStringBuilder, o, false);
            }
        }
        int i5 = this.w;
        if (i5 >= 0 && i > i5) {
            if (i < arrayList.size() + i5 + 1) {
                tLObject = (TLObject) arrayList.get((i - this.w) - 1);
                z = tLObject instanceof TLRPC.User;
                rb5 rb5Var2 = this.x;
                if (z) {
                }
                String o2 = l7c.o(V1);
                size = arrayList2.size();
                if (size != 0) {
                }
                str = null;
                z2 = false;
                if (z2) {
                }
                o2 = null;
                if (str != null) {
                }
                gh6 gh6Var22 = (gh6) view;
                gh6Var22.setTag(Integer.valueOf(i));
                gh6Var22.setCustomImageVisible(rb5Var2.Z1.contains(Long.valueOf(V1.id)));
                gh6Var22.c(V1, spannableStringBuilder, o2, false);
            }
        }
        tLObject = null;
        z = tLObject instanceof TLRPC.User;
        rb5 rb5Var22 = this.x;
        if (z) {
        }
        String o22 = l7c.o(V1);
        size = arrayList2.size();
        if (size != 0) {
        }
        str = null;
        z2 = false;
        if (z2) {
        }
        o22 = null;
        if (str != null) {
        }
        gh6 gh6Var222 = (gh6) view;
        gh6Var222.setTag(Integer.valueOf(i));
        gh6Var222.setCustomImageVisible(rb5Var22.Z1.contains(Long.valueOf(V1.id)));
        gh6Var222.c(V1, spannableStringBuilder, o22, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, l35] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        gh6 gh6Var;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ?? l35Var = new l35(context, null);
                zkb.h(bkb.Zg, null, l35Var);
                l35Var.setTextColor(bkb.Gh);
                gh6Var = l35Var;
            } else if (i != 2) {
                gh6Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new e49(-1, gl.L(56.0f)));
                gh6Var = view;
            }
        } else {
            gh6 gh6Var2 = new gh6(this.c, 2, 2, false, null);
            gh6Var2.setCustomRightImage(R.drawable.msg_invited);
            gh6Var2.setNameColor(bkb.w0(null, bkb.dh, false));
            int w0 = bkb.w0(null, bkb.bh, false);
            int w02 = bkb.w0(null, bkb.fh, false);
            gh6Var2.P = true;
            gh6Var2.I = w0;
            gh6Var2.J = w02;
            gh6Var2.setDividerColor(bkb.jh);
            gh6Var = gh6Var2;
        }
        return new y29(gh6Var);
    }
}
