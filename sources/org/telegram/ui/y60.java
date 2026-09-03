package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.Components.bl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ a70 F;
    public final Context c;
    public final tf.j1 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public y60(a70 a70Var, Context context) {
        TLRPC.Chat chat;
        TLRPC.User user;
        this.F = a70Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = a70Var.getContactsController();
        boolean z4 = a70Var.N;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = a70Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.r.add(user2);
                hashSet.add(Long.valueOf(user2.id));
            }
        }
        if (a70Var.M || a70Var.L || z4) {
            ArrayList<TLRPC.Dialog> allDialogs = a70Var.getMessagesController().getAllDialogs();
            if (z4) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = a70Var.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                        this.r.add(user);
                        hashSet.add(Long.valueOf(user.id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.id) && (chat = a70Var.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.r.add(chat);
                    }
                }
            }
            Collections.sort(this.r, new u60());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i13);
                if (tLObject != null) {
                    String a2 = u60.a(tLObject);
                    String substring = TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1);
                    String a10 = u60.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1))) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.r;
                String a11 = u60.a(tLObject2);
                arrayList2.add(i13, new z60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        tf.j1 j1Var = new tf.j1(false);
        this.f = j1Var;
        j1Var.a = new hu(this, 11);
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f == 0) {
            return false;
        }
        a70 a70Var = this.F;
        if (a70Var.G == null) {
            return true;
        }
        View view = l1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.f4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.f4) view).getObject();
        return !(object instanceof TLRPC.User) || a70Var.G.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.bl0
    public final String F(int i10) {
        String str;
        String str2;
        if (this.n || i10 < this.B) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i11 = this.B;
        if (i10 >= size + i11) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
        if (tLObject instanceof z60) {
            return ((z60) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (LocaleController.nameDisplayOrder == 1) {
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
        }
        return "";
    }

    @Override // org.telegram.ui.Components.bl0
    public final void G(org.telegram.ui.Components.rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        tf.j1 j1Var = this.f;
        a70 a70Var = this.F;
        j1Var.g(null, true, a70Var.L || a70Var.M, false, false, 0L, false, 0, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        x60 x60Var = new x60(this, str, 0);
        this.h = x60Var;
        dispatchQueue.postRunnable(x60Var, 300L);
    }

    @Override // f2.o0
    public final int h() {
        int i10;
        a70 a70Var = this.F;
        long j10 = a70Var.E;
        long j11 = a70Var.D;
        this.D = -1;
        this.s = -1;
        this.w = -1;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        if (this.n) {
            int size = this.d.size();
            tf.j1 j1Var = this.f;
            int size2 = j1Var.d.size();
            int size3 = j1Var.e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.E = i11;
            return i11;
        }
        if (a70Var.N) {
            this.w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (a70Var.S) {
            int i12 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.x = i12;
        } else if (a70Var.T) {
            int i13 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.y = i13;
        } else {
            this.v = i10;
        }
        this.B = i10;
        int size4 = this.r.size() + i10;
        if (a70Var.O) {
            if (j11 != 0) {
                this.C = ChatObject.canUserDoAdminAction(a70Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = a70Var.getMessagesController().getChat(Long.valueOf(j10));
                this.C = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
            } else {
                this.C = 0;
            }
            if (this.C != 0) {
                this.B++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.D = 0;
            size4++;
        }
        this.E = size4;
        return size4;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (this.n) {
            return i10 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i10 == this.w) {
            return 2;
        }
        if (i10 == this.s) {
            return 0;
        }
        if (i10 == this.x || i10 == this.y) {
            return 1;
        }
        if (this.C != 0 && i10 == 0) {
            return 2;
        }
        if (this.D == i10) {
            return 3;
        }
        int i11 = i10 - this.B;
        if (i11 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i11 >= arrayList.size() || !(arrayList.get(i10 - this.B) instanceof z60)) ? 1 : 0;
    }

    @Override // f2.o0
    public final void l() {
        super.l();
        this.F.r0();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String publicUsername;
        int i11 = l1Var.f;
        View view = l1Var.a;
        ArrayList arrayList = this.r;
        a70 a70Var = this.F;
        if (i11 == 0) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (this.n) {
                t3Var.setText(LocaleController.getString(R.string.GlobalSearch));
            } else if (i10 == this.s) {
                t3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
            } else {
                int i12 = i10 - this.B;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.B);
                    if (tLObject2 instanceof z60) {
                        t3Var.setText(((z60) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i10 == this.v) {
                t3Var.b((a70Var.U == null && a70Var.W.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new g60(this, 2));
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (i10 == this.w) {
                n8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                n8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                return;
            } else if (this.C == 2) {
                n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                n8Var.e(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                return;
            } else {
                n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                n8Var.e(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        CharSequence charSequence3 = null;
        if (this.n) {
            int size = this.d.size();
            tf.j1 j1Var = this.f;
            ArrayList arrayList2 = j1Var.e;
            ArrayList arrayList3 = j1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 > (size2 + size) + size3) ? null : (TLObject) j1Var.e.get(((i10 - size) - size3) - 1) : (TLObject) arrayList3.get(i10 - size) : (TLObject) this.d.get(i10);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    publicUsername = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                }
                if (i10 < size) {
                    charSequence2 = (CharSequence) this.e.get(i10);
                    if (charSequence2 != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence2.toString().startsWith("@" + publicUsername)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = j1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = publicUsername;
                    }
                }
                CharSequence charSequence4 = charSequence3;
                charSequence3 = charSequence2;
                charSequence = charSequence4;
            }
            charSequence2 = null;
            CharSequence charSequence42 = charSequence3;
            charSequence3 = charSequence2;
            charSequence = charSequence42;
        } else {
            if (i10 == this.x) {
                f4Var.r = true;
                f4Var.f = "premium";
                f4Var.a.setImageDrawable(org.telegram.ui.Cells.f4.b(f4Var.getContext(), false));
                f4Var.b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.k5 k5Var = f4Var.c;
                int i13 = org.telegram.ui.ActionBar.j6.y6;
                k5Var.setTag(Integer.valueOf(i13));
                if (f4Var.H) {
                    i13 = org.telegram.ui.ActionBar.j6.og;
                }
                k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f4Var.J));
                k5Var.setEmojiColor(k5Var.getTextColor());
                k5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                f4Var.c(a70Var.U != null, false);
                return;
            }
            if (i10 == this.y) {
                f4Var.s = true;
                f4Var.f = "miniapps";
                org.telegram.ui.Components.p9 p9Var = f4Var.a;
                f4Var.getContext();
                p9Var.setImageDrawable(org.telegram.ui.Cells.f4.a(false));
                f4Var.b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.k5 k5Var2 = f4Var.c;
                int i14 = org.telegram.ui.ActionBar.j6.y6;
                k5Var2.setTag(Integer.valueOf(i14));
                if (f4Var.H) {
                    i14 = org.telegram.ui.ActionBar.j6.og;
                }
                k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f4Var.J));
                k5Var2.setEmojiColor(k5Var2.getTextColor());
                k5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                f4Var.c(a70Var.V != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i10 - this.B);
            charSequence = null;
        }
        f4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = a70Var.G;
            if (hVar == null || hVar.h(j10) < 0) {
                f4Var.c(a70Var.W.h(j10) >= 0, false);
                f4Var.setCheckBoxEnabled(true);
            } else {
                f4Var.c(true, false);
                f4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View t3Var;
        Context context = this.c;
        if (i10 == 0) {
            t3Var = new org.telegram.ui.Cells.t3(context, null);
        } else if (i10 == 1) {
            t3Var = new org.telegram.ui.Cells.f4(context, 1, 0, false);
        } else if (i10 != 3) {
            t3Var = new org.telegram.ui.Cells.n8(context);
        } else {
            org.telegram.ui.Components.w60 w60Var = new org.telegram.ui.Components.w60(context, null, 0, null, 1);
            w60Var.setLayoutParams(new f2.w0(-1, -1));
            w60Var.e.setVisibility(8);
            w60Var.d.setText(LocaleController.getString(R.string.NoContacts));
            w60Var.setAnimateLayoutChange(true);
            t3Var = w60Var;
        }
        return new org.telegram.ui.Components.dl0(t3Var);
    }
}
