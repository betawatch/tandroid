package tf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.xt;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class c1 extends ql0 {
    public int B;
    public int C;
    public ArrayList D;
    public ArrayList E;
    public String F;
    public int G;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public j1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.E.size();
        j1 j1Var = this.f;
        int size3 = j1Var.e.size();
        int size4 = j1Var.j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.E.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return j1Var.j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return j1Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.E.clear();
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
        timer2.schedule(new xt(this, str, 1), 200L, 300L);
    }

    @Override // f2.o0
    public final int h() {
        j1 j1Var = this.f;
        this.G = -1;
        int size = this.d.size();
        if (!this.E.isEmpty()) {
            this.G = size;
            size += this.E.size() + 1;
        }
        int size2 = j1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = j1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // f2.o0
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
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        long j10;
        String str;
        long j11;
        boolean z4;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                t3 t3Var = (t3) view;
                if (i10 == this.G) {
                    t3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i10) == null) {
                    t3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    t3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i10);
                ((g6) view).t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), y3.j(new StringBuilder("+"), contact.shortPhones.get(0), se.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            n8 n8Var = (n8) view;
            n8Var.e(-1, j6.o6);
            n8Var.i(LocaleController.formatString(R.string.AddContactByPhone, se.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i10);
        if (tLObject != null) {
            CharSequence charSequence3 = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = UserObject.getPublicUsername(user);
                if (str != null && this.F != null && !str.toLowerCase().contains(this.F.toLowerCase()) && user.usernames != null) {
                    for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i12);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.F.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                long j12 = user.id;
                z4 = user.self;
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
                z4 = false;
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
                            g6 g6Var = (g6) view;
                            if (z4) {
                                charSequence3 = LocaleController.getString(R.string.SavedMessages);
                            }
                            g6Var.t(tLObject, null, charSequence3, charSequence2, false, z4);
                            g6Var.s(this.h.h(j11) >= 0, false);
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
                        spannableStringBuilder.setSpan(new f10(j6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = null;
                    charSequence3 = spannableStringBuilder;
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence2 = str;
                }
            }
            charSequence2 = charSequence3;
            charSequence3 = charSequence;
            g6 g6Var2 = (g6) view;
            if (z4) {
            }
            g6Var2.t(tLObject, null, charSequence3, charSequence2, false, z4);
            g6Var2.s(this.h.h(j11) >= 0, false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            g6 g6Var = new g6(context, null);
            g6Var.J0 = true;
            g6Var.B0 = true;
            view = g6Var;
        } else if (i10 == 1) {
            t3 t3Var = new t3(context, 26, null);
            t3Var.setNoBackground(true);
            view = t3Var;
        } else if (i10 == 3) {
            g6 g6Var2 = new g6(context, null);
            g6Var2.J0 = true;
            g6Var2.B0 = true;
            view = g6Var2;
        } else if (i10 == 4) {
            View q0Var = new q0(context, 1);
            q0Var.setId(9);
            q0Var.setTag(-33024);
            view = q0Var;
        } else if (i10 != 5) {
            view = new n8(16, context, false);
        } else {
            u00 u00Var = new u00(context, null);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(29);
            u00Var.setBackgroundColor(j6.w0(null, j6.d6, false));
            view = u00Var;
        }
        return new dl0(view);
    }
}
