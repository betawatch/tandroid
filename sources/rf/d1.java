package rf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.ot;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d1 extends il0 {
    public int A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public String E;
    public int F;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public k1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.D.size();
        k1 k1Var = this.f;
        int size3 = k1Var.e.size();
        int size4 = k1Var.j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.D.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return k1Var.j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return k1Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.d.clear();
        this.D.clear();
        this.e.clear();
        if (this.r) {
            this.f.g(null, true, false, this.s, this.v, this.x, this.w, 0, 0);
        }
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.n = timer2;
        timer2.schedule(new ot(this, str, 1), 200L, 300L);
    }

    @Override // f2.p0
    public final int h() {
        k1 k1Var = this.f;
        this.F = -1;
        int size = this.d.size();
        if (!this.D.isEmpty()) {
            this.F = size;
            size += this.D.size() + 1;
        }
        int size2 = k1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = k1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof ContactsController.Contact ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(n1 n1Var, int i10) {
        long j10;
        String str;
        long j11;
        boolean z10;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                s3 s3Var = (s3) view;
                if (i10 == this.F) {
                    s3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i10) == null) {
                    s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    s3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i10);
                ((f6) view).t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), x3.k(new StringBuilder("+"), contact.shortPhones.get(0), qe.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            m8 m8Var = (m8) view;
            m8Var.e(-1, g6.o6);
            m8Var.i(LocaleController.formatString(R.string.AddContactByPhone, qe.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i10);
        if (tLObject != null) {
            CharSequence charSequence3 = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = UserObject.getPublicUsername(user);
                if (str != null && this.E != null && !str.toLowerCase().contains(this.E.toLowerCase()) && user.usernames != null) {
                    for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i12);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.E.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                long j12 = user.id;
                z10 = user.self;
                j11 = j12;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str = ChatObject.getPublicUsername(chat);
                    j10 = chat.id;
                } else {
                    j10 = 0;
                    str = null;
                }
                j11 = j10;
                z10 = false;
            }
            if (i10 < this.d.size()) {
                CharSequence charSequence4 = (CharSequence) this.e.get(i10);
                charSequence = charSequence4;
                charSequence = charSequence4;
                if (charSequence4 != null && str != null) {
                    charSequence = charSequence4;
                    if (str.length() > 0) {
                        boolean startsWith = charSequence4.toString().startsWith("@".concat(str));
                        charSequence = charSequence4;
                        if (startsWith) {
                            charSequence2 = charSequence4;
                            f6 f6Var = (f6) view;
                            if (z10) {
                                charSequence3 = LocaleController.getString(R.string.SavedMessages);
                            }
                            f6Var.t(tLObject, null, charSequence3, charSequence2, false, z10);
                            f6Var.s(this.h.h(j11) >= 0, false);
                        }
                    }
                }
            } else if (i10 <= this.d.size() || str == null) {
                charSequence = null;
            } else {
                String str3 = this.f.c;
                if (str3 != null && str3.startsWith("@")) {
                    str3 = str3.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) str);
                    if (str3 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, str3)) != -1) {
                        int length = str3.length();
                        if (indexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            indexOfIgnoreCase++;
                        }
                        spannableStringBuilder.setSpan(new a10(g6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = null;
                    charSequence3 = spannableStringBuilder;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    charSequence2 = str;
                }
            }
            charSequence2 = charSequence3;
            charSequence3 = charSequence;
            f6 f6Var2 = (f6) view;
            if (z10) {
            }
            f6Var2.t(tLObject, null, charSequence3, charSequence2, false, z10);
            f6Var2.s(this.h.h(j11) >= 0, false);
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            f6 f6Var = new f6(context, null);
            f6Var.I0 = true;
            f6Var.A0 = true;
            view = f6Var;
        } else if (i10 == 1) {
            s3 s3Var = new s3(context, 26, null);
            s3Var.setNoBackground(true);
            view = s3Var;
        } else if (i10 == 3) {
            f6 f6Var2 = new f6(context, null);
            f6Var2.I0 = true;
            f6Var2.A0 = true;
            view = f6Var2;
        } else if (i10 == 4) {
            View r0Var = new r0(context, 1);
            r0Var.setId(9);
            r0Var.setTag(-33024);
            view = r0Var;
        } else if (i10 != 5) {
            view = new m8(16, context, false);
        } else {
            p00 p00Var = new p00(context, null);
            p00Var.setIsSingleCell(true);
            p00Var.setViewType(29);
            p00Var.setBackgroundColor(g6.w0(null, g6.d6, false));
            view = p00Var;
        }
        return new vk0(view);
    }
}
