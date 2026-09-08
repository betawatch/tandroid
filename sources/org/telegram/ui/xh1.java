package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xh1 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final hg.b2 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public xh1(UsersSelectActivity usersSelectActivity, Context context) {
        this.v = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.F) {
            this.s = 0;
        } else {
            int i10 = usersSelectActivity.x;
            if (i10 == 2) {
                this.s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 != 0) {
                this.s = 0;
            } else if (usersSelectActivity.I) {
                this.s = 7;
            } else {
                this.s = 5;
            }
        }
        int i11 = usersSelectActivity.x;
        boolean z10 = i11 != 2;
        boolean z11 = i11 != 2;
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.id)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.id));
                    if (user != null && ((usersSelectActivity.G || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.id));
                    if (z11 && chat != null) {
                        this.r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.G) {
            this.r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        hg.b2 b2Var = new hg.b2(false);
        this.f = b2Var;
        b2Var.p = false;
        b2Var.a = new vl0(this, 25);
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(org.telegram.ui.Components.ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.x;
        boolean z10 = i10 != 2;
        boolean z11 = i10 != 2;
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            wh1 wh1Var = new wh1(this, str, z11, z10, 0);
            this.h = wh1Var;
            dispatchQueue.postRunnable(wh1Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        l();
    }

    @Override // s4.h0
    public final int h() {
        if (this.n) {
            int size = this.d.size();
            hg.b2 b2Var = this.f;
            return b2Var.e.size() + b2Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.r.size() + i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.x) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        Object obj;
        String string;
        CharSequence charSequence;
        ?? r11;
        long j3;
        int i11;
        long j10;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        boolean canUserDoAdminAction;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        CharSequence charSequence2;
        int i12 = c1Var.f;
        View view = c1Var.a;
        UsersSelectActivity usersSelectActivity = this.v;
        int i13 = 2;
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != 0 || usersSelectActivity.F) {
                u3Var.setText(LocaleController.getString(R.string.FilterChats));
                return;
            } else {
                u3Var.setText(LocaleController.getString(R.string.FilterChatTypes));
                return;
            }
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        if (this.n) {
            int size = this.d.size();
            hg.b2 b2Var = this.f;
            ArrayList arrayList = b2Var.e;
            ArrayList arrayList2 = b2Var.d;
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            obj = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 >= (size2 + size) + size3) ? null : b2Var.e.get((i10 - size) - size3) : arrayList2.get(i10 - size) : this.d.get(i10);
            if (obj != null) {
                String publicUsername = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : ChatObject.getPublicUsername((TLRPC.Chat) obj);
                if (i10 < size) {
                    charSequence = (CharSequence) this.e.get(i10);
                    if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence.toString().startsWith("@" + publicUsername)) {
                            charSequence2 = charSequence;
                        }
                    }
                    r11 = 0;
                    j3 = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    i11 = usersSelectActivity.x;
                    if (i11 != 2) {
                        if (i11 != 0) {
                            j10 = 0;
                            int i14 = usersSelectActivity.getMessagesController().dialogs_dict.f(j3) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.f(j3)).ttl_period : 0;
                            if (i14 > 0) {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                spannableStringBuilder4.append((CharSequence) "d");
                                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder4.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i14)).toLowerCase());
                                spannableStringBuilder = spannableStringBuilder4;
                                z10 = true;
                            } else {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                                spannableStringBuilder = spannableStringBuilder5;
                                z10 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z12 = z10;
                                canUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                                z11 = z12;
                                spannableStringBuilder2 = spannableStringBuilder;
                                if (canUserDoAdminAction) {
                                }
                                f4Var.d(obj, charSequence, spannableStringBuilder2);
                                f4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, false));
                                if (j3 == j10) {
                                }
                            } else {
                                z11 = z10;
                                spannableStringBuilder3 = spannableStringBuilder;
                                canUserDoAdminAction = true;
                                spannableStringBuilder2 = spannableStringBuilder3;
                                if (canUserDoAdminAction) {
                                }
                                f4Var.d(obj, charSequence, spannableStringBuilder2);
                                f4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, false));
                                if (j3 == j10) {
                                }
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = f4Var.getStatusTextView().getPaint().getFontMetricsInt();
                            r11 = new SpannableStringBuilder();
                            ArrayList<MessagesController.DialogFilter> arrayList3 = usersSelectActivity.getMessagesController().dialogFilters;
                            int size4 = arrayList3.size();
                            j10 = 0;
                            for (int i15 = 0; i15 < size4; i15++) {
                                MessagesController.DialogFilter dialogFilter = arrayList3.get(i15);
                                if (dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j3)) {
                                    if (r11.length() > 0) {
                                        r11.append(", ");
                                    }
                                    r11.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                                }
                            }
                            z11 = false;
                            spannableStringBuilder3 = r11;
                            canUserDoAdminAction = true;
                            spannableStringBuilder2 = spannableStringBuilder3;
                            if (canUserDoAdminAction) {
                                f4Var.setAlpha(0.5f);
                            } else {
                                f4Var.setAlpha(1.0f);
                            }
                            f4Var.d(obj, charSequence, spannableStringBuilder2);
                            f4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, false));
                            if (j3 == j10) {
                                f4Var.c(usersSelectActivity.N.h(j3) >= 0, false);
                                f4Var.setCheckBoxEnabled(true);
                                return;
                            }
                            return;
                        }
                    }
                    j10 = 0;
                    z11 = false;
                    spannableStringBuilder3 = r11;
                    canUserDoAdminAction = true;
                    spannableStringBuilder2 = spannableStringBuilder3;
                    if (canUserDoAdminAction) {
                    }
                    f4Var.d(obj, charSequence, spannableStringBuilder2);
                    f4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, false));
                    if (j3 == j10) {
                    }
                } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = b2Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                        spannableStringBuilder6.append((CharSequence) "@");
                        spannableStringBuilder6.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder6.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        charSequence2 = spannableStringBuilder6;
                    } catch (Exception unused) {
                        charSequence2 = publicUsername;
                    }
                }
                charSequence = null;
                r11 = charSequence2;
                if (obj instanceof TLRPC.User) {
                }
                i11 = usersSelectActivity.x;
                if (i11 != 2) {
                }
                j10 = 0;
                z11 = false;
                spannableStringBuilder3 = r11;
                canUserDoAdminAction = true;
                spannableStringBuilder2 = spannableStringBuilder3;
                if (canUserDoAdminAction) {
                }
                f4Var.d(obj, charSequence, spannableStringBuilder2);
                f4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, false));
                if (j3 == j10) {
                }
            }
        } else {
            int i16 = this.s;
            if (i10 < i16) {
                String str2 = "non_contacts";
                if (usersSelectActivity.x == 2) {
                    if (i10 == 1) {
                        string = LocaleController.getString(R.string.FilterExistingChats);
                        str2 = "existing_chats";
                        i13 = 1;
                    } else if (i10 == 2 && !usersSelectActivity.H) {
                        string = LocaleController.getString(R.string.FilterNewChats);
                        str2 = "new_chats";
                    } else if (i10 == (!usersSelectActivity.H ? 1 : 0) + 2) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        str2 = "contacts";
                        i13 = 4;
                    } else {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i13 = 8;
                    }
                } else if (usersSelectActivity.I) {
                    if (i10 == 1) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        str2 = "contacts";
                    } else if (i10 == 2) {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i10 == 3) {
                        string = LocaleController.getString(R.string.FilterGroups);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        str2 = "groups";
                    } else if (i10 == 4) {
                        string = LocaleController.getString(R.string.FilterChannels);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        str2 = "channels";
                    } else {
                        string = LocaleController.getString(R.string.FilterBots);
                        i13 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        str2 = "bots";
                    }
                } else if (i10 == 1) {
                    string = LocaleController.getString(R.string.FilterMuted);
                    i13 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    str2 = "muted";
                } else if (i10 == 2) {
                    string = LocaleController.getString(R.string.FilterRead);
                    i13 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    str2 = "read";
                } else {
                    string = LocaleController.getString(R.string.FilterArchived);
                    i13 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    str2 = "archived";
                }
                f4Var.d(str2, string, null);
                f4Var.c((usersSelectActivity.J & i13) == i13, false);
                f4Var.setCheckBoxEnabled(true);
                return;
            }
            obj = this.r.get(i10 - i16);
        }
        charSequence = null;
        r11 = 0;
        if (obj instanceof TLRPC.User) {
        }
        i11 = usersSelectActivity.x;
        if (i11 != 2) {
        }
        j10 = 0;
        z11 = false;
        spannableStringBuilder3 = r11;
        canUserDoAdminAction = true;
        spannableStringBuilder2 = spannableStringBuilder3;
        if (canUserDoAdminAction) {
        }
        f4Var.d(obj, charSequence, spannableStringBuilder2);
        f4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, false));
        if (j3 == j10) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.vk0(i10 != 1 ? new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.f4(context, 1, 0, true));
    }
}
