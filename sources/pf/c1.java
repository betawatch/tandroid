package pf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.qt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class c1 extends yk0 {
    public int A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public String E;
    public int F;
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

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.D.size();
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
                return this.D.get(i11 - 1);
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

    public final void F(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
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
        timer2.schedule(new qt(this, str, 1), 200L, 300L);
    }

    @Override // f2.q0
    public final int h() {
        j1 j1Var = this.f;
        this.F = -1;
        int size = this.d.size();
        if (!this.D.isEmpty()) {
            this.F = size;
            size += this.D.size() + 1;
        }
        int size2 = j1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = j1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // f2.q0
    public final int j(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof ContactsController.Contact ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        long j10;
        String str;
        long j11;
        boolean z10;
        CharSequence charSequence;
        int indexOfIgnoreCase;
        int i11 = o1Var.f;
        View view = o1Var.a;
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
                ((e6) view).u(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), y1.k(new StringBuilder("+"), contact.shortPhones.get(0), oe.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            l8 l8Var = (l8) view;
            l8Var.e(-1, g6.o6);
            l8Var.i(LocaleController.formatString(R.string.AddContactByPhone, oe.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i10);
        if (tLObject != null) {
            CharSequence charSequence2 = null;
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
                CharSequence charSequence3 = (CharSequence) this.e.get(i10);
                if (charSequence3 == null || str == null || str.length() <= 0 || !charSequence3.toString().startsWith("@".concat(str))) {
                    charSequence = null;
                    charSequence2 = charSequence3;
                } else {
                    charSequence = charSequence3;
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
                        spannableStringBuilder.setSpan(new s00(g6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    charSequence = str;
                }
            }
            e6 e6Var = (e6) view;
            if (z10) {
                charSequence2 = LocaleController.getString(R.string.SavedMessages);
            }
            e6Var.u(tLObject, null, charSequence2, charSequence, false, z10);
            e6Var.t(this.h.h(j11) >= 0, false);
        }
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            e6 e6Var = new e6(context, null);
            e6Var.I0 = true;
            e6Var.A0 = true;
            view = e6Var;
        } else if (i10 == 1) {
            s3 s3Var = new s3(context, 26, null);
            s3Var.setNoBackground(true);
            view = s3Var;
        } else if (i10 == 3) {
            e6 e6Var2 = new e6(context, null);
            e6Var2.I0 = true;
            e6Var2.A0 = true;
            view = e6Var2;
        } else if (i10 == 4) {
            View q0Var = new q0(context, 1);
            q0Var.setId(9);
            q0Var.setTag(-33024);
            view = q0Var;
        } else if (i10 != 5) {
            view = new l8(16, context, false);
        } else {
            h00 h00Var = new h00(context, null);
            h00Var.setIsSingleCell(true);
            h00Var.setViewType(29);
            h00Var.setBackgroundColor(g6.w0(null, g6.d6, false));
            view = h00Var;
        }
        return new lk0(view);
    }
}
