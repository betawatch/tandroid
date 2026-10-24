package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qg1 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final hg.a2 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public qg1(UsersSelectActivity usersSelectActivity, Context context) {
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
        int i12 = 0;
        boolean z12 = false;
        while (i12 < size) {
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
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        hg.a2 a2Var = new hg.a2(false);
        this.f = a2Var;
        a2Var.p = false;
        a2Var.a = new sp0(this, 24);
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
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
            pg1 pg1Var = new pg1(this, str, z11, z10, 0);
            this.h = pg1Var;
            dispatchQueue.postRunnable(pg1Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        l();
    }

    @Override // s4.g0
    public final int h() {
        if (this.n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f;
            return a2Var.e.size() + a2Var.d.size() + size;
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

    @Override // s4.g0
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
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Type inference failed for: r11v20 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        Object obj;
        String string;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        int i11;
        long j11;
        SpannableStringBuilder spannableStringBuilder2;
        boolean z10;
        boolean z11;
        boolean canUserDoAdminAction;
        SpannableStringBuilder spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4;
        int i12 = b1Var.f;
        View view = b1Var.a;
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
            hg.a2 a2Var = this.f;
            ArrayList arrayList = a2Var.e;
            ArrayList arrayList2 = a2Var.d;
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            obj = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 >= (size2 + size) + size3) ? null : a2Var.e.get((i10 - size) - size3) : arrayList2.get(i10 - size) : this.d.get(i10);
            if (obj != null) {
                String publicUsername = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : ChatObject.getPublicUsername((TLRPC.Chat) obj);
                if (i10 < size) {
                    charSequence = (CharSequence) this.e.get(i10);
                    if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence.toString().startsWith("@" + publicUsername)) {
                            publicUsername = charSequence;
                        }
                    }
                    spannableStringBuilder = null;
                    j10 = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    i11 = usersSelectActivity.x;
                    if (i11 != 2) {
                        if (i11 != 0) {
                            j11 = 0;
                            int i14 = usersSelectActivity.getMessagesController().dialogs_dict.f(j10) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.f(j10)).ttl_period : 0;
                            if (i14 > 0) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.xq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i14)).toLowerCase());
                                spannableStringBuilder2 = spannableStringBuilder5;
                                z10 = true;
                            } else {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                spannableStringBuilder6.append((CharSequence) "d");
                                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.xq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder6.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                                spannableStringBuilder2 = spannableStringBuilder6;
                                z10 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z12 = z10;
                                canUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                                z11 = z12;
                                spannableStringBuilder3 = spannableStringBuilder2;
                                if (canUserDoAdminAction) {
                                }
                                f4Var.d(obj, charSequence, spannableStringBuilder3);
                                org.telegram.ui.ActionBar.r6.Z(f4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, null);
                                if (j10 == j11) {
                                }
                            } else {
                                z11 = z10;
                                spannableStringBuilder4 = spannableStringBuilder2;
                                canUserDoAdminAction = true;
                                spannableStringBuilder3 = spannableStringBuilder4;
                                if (canUserDoAdminAction) {
                                }
                                f4Var.d(obj, charSequence, spannableStringBuilder3);
                                org.telegram.ui.ActionBar.r6.Z(f4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, null);
                                if (j10 == j11) {
                                }
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = f4Var.getStatusTextView().getPaint().getFontMetricsInt();
                            spannableStringBuilder = new SpannableStringBuilder();
                            ArrayList<MessagesController.DialogFilter> arrayList3 = usersSelectActivity.getMessagesController().dialogFilters;
                            int size4 = arrayList3.size();
                            j11 = 0;
                            for (int i15 = 0; i15 < size4; i15++) {
                                MessagesController.DialogFilter dialogFilter = arrayList3.get(i15);
                                if (dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j10)) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((CharSequence) MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                                }
                            }
                            z11 = false;
                            spannableStringBuilder4 = spannableStringBuilder;
                            canUserDoAdminAction = true;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            if (canUserDoAdminAction) {
                                f4Var.setAlpha(0.5f);
                            } else {
                                f4Var.setAlpha(1.0f);
                            }
                            f4Var.d(obj, charSequence, spannableStringBuilder3);
                            org.telegram.ui.ActionBar.r6.Z(f4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, null);
                            if (j10 == j11) {
                                f4Var.c(usersSelectActivity.N.h(j10) >= 0, false);
                                f4Var.setCheckBoxEnabled(true);
                                return;
                            }
                            return;
                        }
                    }
                    j11 = 0;
                    z11 = false;
                    spannableStringBuilder4 = spannableStringBuilder;
                    canUserDoAdminAction = true;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    if (canUserDoAdminAction) {
                    }
                    f4Var.d(obj, charSequence, spannableStringBuilder3);
                    org.telegram.ui.ActionBar.r6.Z(f4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, null);
                    if (j10 == j11) {
                    }
                } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = a2Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        spannableStringBuilder7.append((CharSequence) "@");
                        spannableStringBuilder7.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        publicUsername = spannableStringBuilder7;
                    } catch (Exception unused) {
                    }
                }
                charSequence = null;
                spannableStringBuilder = publicUsername;
                if (obj instanceof TLRPC.User) {
                }
                i11 = usersSelectActivity.x;
                if (i11 != 2) {
                }
                j11 = 0;
                z11 = false;
                spannableStringBuilder4 = spannableStringBuilder;
                canUserDoAdminAction = true;
                spannableStringBuilder3 = spannableStringBuilder4;
                if (canUserDoAdminAction) {
                }
                f4Var.d(obj, charSequence, spannableStringBuilder3);
                org.telegram.ui.ActionBar.r6.Z(f4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, null);
                if (j10 == j11) {
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
                        i13 = 4;
                        str2 = "contacts";
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
        spannableStringBuilder = null;
        if (obj instanceof TLRPC.User) {
        }
        i11 = usersSelectActivity.x;
        if (i11 != 2) {
        }
        j11 = 0;
        z11 = false;
        spannableStringBuilder4 = spannableStringBuilder;
        canUserDoAdminAction = true;
        spannableStringBuilder3 = spannableStringBuilder4;
        if (canUserDoAdminAction) {
        }
        f4Var.d(obj, charSequence, spannableStringBuilder3);
        org.telegram.ui.ActionBar.r6.Z(f4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.k6.n6 : org.telegram.ui.ActionBar.k6.y6, null);
        if (j10 == j11) {
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.wl0(i10 != 1 ? new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.f4(context, 1, 0, true));
    }
}
