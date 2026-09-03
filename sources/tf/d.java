package tf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.ai;
import ph.z4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class d extends nl0 {
    public final boolean B;
    public int C;
    public final boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final int v;
    public final boolean w;
    public final a0.h x;
    public ArrayList y;

    public d(Context context, int i10, boolean z4, a0.h hVar, int i11) {
        this.s = context;
        this.v = i10;
        this.w = z4;
        this.x = hVar;
        this.B = i11 != 0;
        this.D = i11 == 2;
    }

    @Override // org.telegram.ui.Components.bl0
    public final String F(int i10) {
        if (this.C != 2 && !this.F) {
            int i11 = this.r;
            int i12 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i11);
            ArrayList<String> arrayList = i12 == 2 ? contactsController.sortedUsersMutualSectionsArray : contactsController.sortedUsersSectionsArray;
            int S = S(i10);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i12 == 0 || this.B) {
                if (S > 0 && S <= arrayList.size()) {
                    return arrayList.get(S - 1);
                }
            } else if (S >= 0 && S < arrayList.size()) {
                return arrayList.get(S);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.nl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i10) {
        boolean z4 = this.H;
        int i11 = this.r;
        if (z4) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return ContactsController.getInstance(i11).phoneBookContacts.size() + 2;
            }
            return 0;
        }
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z10 = this.B;
        boolean z11 = this.w;
        if (i12 != 0 && !z10) {
            if (!this.F) {
                if (i10 < arrayList.size()) {
                    int size = hashMap.get(arrayList.get(i10)).size();
                    return (i10 != arrayList.size() - 1 || z11) ? size + 1 : size;
                }
                if (z11) {
                }
            }
            return 1;
        }
        if (i10 == 0) {
            if (this.F) {
                return 2;
            }
            return z10 ? 3 : 4;
        }
        if (!this.F) {
            if (this.C != 2) {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    int size2 = hashMap.get(arrayList.get(i13)).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i10 == 1) {
                if (this.y.isEmpty()) {
                    return 0;
                }
                return this.y.size();
            }
            if (z11) {
                return 0;
            }
            return ContactsController.getInstance(i11).phoneBookContacts.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.nl0
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override // org.telegram.ui.Components.nl0
    public final Object O(int i10, int i11) {
        int i12;
        boolean z4 = this.H;
        int i13 = this.r;
        if (z4 && i10 == 1 && i11 > 1 && i11 - 2 < ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return ContactsController.getInstance(i13).phoneBookContacts.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i13);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i14 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        ArrayList<String> arrayList = i14 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (i14 != 0 && !this.B) {
            if (i10 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList2.get(i11).user_id));
                }
            }
            return null;
        }
        if (i10 == 0) {
            return null;
        }
        if (this.C != 2) {
            int i15 = i10 - 1;
            if (i15 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList3 = hashMap.get(arrayList.get(i15));
                if (i11 < arrayList3.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList3.get(i11).user_id));
                }
                return null;
            }
        } else if (i10 == 1) {
            if (i11 < this.y.size()) {
                return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.y.get(i11)).user_id));
            }
            return null;
        }
        if (!this.w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return null;
        }
        return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    @Override // org.telegram.ui.Components.nl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i10, int i11) {
        if (this.H) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 != 1) {
                return 8;
            }
            if (i11 == 0) {
                return 5;
            }
            return i11 == 1 ? 7 : 8;
        }
        int i12 = this.v;
        int i13 = this.r;
        ContactsController contactsController = ContactsController.getInstance(i13);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z4 = this.B;
        if (i12 == 0 || z4) {
            if (i10 == 0) {
                if (z4) {
                    if (i11 == 1) {
                        return 5;
                    }
                    if (i11 == 2) {
                        int i14 = this.C;
                        return (i14 == 1 || i14 == 2) ? 7 : 2;
                    }
                } else if (this.w) {
                    if (i11 >= 2) {
                        if (i11 == 2) {
                            return 5;
                        }
                        if (i11 == 3) {
                            if (this.F) {
                                return 5;
                            }
                            int i15 = this.C;
                            if (i15 == 1 || i15 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i11 == 2) {
                        return 5;
                    }
                    if (i11 == 3) {
                        if (this.F) {
                            return 5;
                        }
                        int i16 = this.C;
                        if (i16 == 1 || i16 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.F) {
                    return 4;
                }
                if (this.C != 2) {
                    int i17 = i10 - 1;
                    if (i17 < arrayList.size()) {
                        if (i11 < hashMap.get(arrayList.get(i17)).size()) {
                            return 0;
                        }
                    }
                } else if (i10 == 1) {
                    if (i11 < this.y.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.F) {
            return 4;
        }
        if (i11 < hashMap.get(arrayList.get(i10)).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.nl0
    public final View T(int i10, View view) {
        View view2;
        int i11 = this.r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        if (i12 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (view == null) {
            q4 q4Var = new q4(this.s);
            q4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(q4Var.getContext());
            q4Var.a = textView;
            ai.o(22.0f, 1, textView);
            ai.s(j6.B6, null, false, textView, 17);
            q4Var.addView(textView, b6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = q4Var;
        } else {
            view2 = view;
        }
        q4 q4Var2 = (q4) view2;
        if (this.C == 2 || this.E || this.F) {
            q4Var2.setLetter("");
            return view2;
        }
        if (i12 != 0 && !this.B) {
            if (i10 < arrayList.size()) {
                q4Var2.setLetter(arrayList.get(i10));
                return view2;
            }
            q4Var2.setLetter("");
            return view2;
        }
        if (i10 == 0) {
            q4Var2.setLetter("");
            return view2;
        }
        int i13 = i10 - 1;
        if (i13 < arrayList.size()) {
            q4Var2.setLetter(arrayList.get(i13));
            return view2;
        }
        q4Var2.setLetter("");
        return view2;
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        if (!this.H) {
            int i12 = this.v;
            int i13 = this.r;
            ContactsController contactsController = ContactsController.getInstance(i13);
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
            ContactsController contactsController2 = ContactsController.getInstance(i13);
            ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
            boolean z4 = this.B;
            if (i12 == 0 || z4) {
                if (i10 == 0) {
                    if (z4) {
                        if (i11 >= 1) {
                            return false;
                        }
                    } else if (this.w) {
                        if (i11 >= 2) {
                            return false;
                        }
                    } else if (i11 >= 3) {
                        return false;
                    }
                } else {
                    if (this.F) {
                        return false;
                    }
                    if (this.C != 2) {
                        int i14 = i10 - 1;
                        if (i14 < arrayList.size() && i11 >= hashMap.get(arrayList.get(i14)).size()) {
                            return false;
                        }
                    } else if (i10 == 1 && i11 >= this.y.size()) {
                        return false;
                    }
                }
            } else if (this.F || i11 >= hashMap.get(arrayList.get(i10)).size()) {
                return false;
            }
        } else if (i10 != 1 || i11 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void W(int i10, int i11, f2.l1 l1Var) {
        ArrayList<TLRPC.TL_contact> arrayList;
        int i12 = l1Var.f;
        View view = l1Var.a;
        int i13 = 7;
        boolean z4 = this.B;
        int i14 = this.r;
        if (i12 == 0) {
            ua uaVar = (ua) view;
            uaVar.Q.a = false;
            if (this.C != 2 && !this.E) {
                i13 = 58;
            }
            uaVar.b(i13, 1);
            if (this.C == 2) {
                arrayList = this.y;
            } else {
                int i15 = this.v;
                ContactsController contactsController = ContactsController.getInstance(i14);
                arrayList = (i15 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict).get((i15 == 2 ? ContactsController.getInstance(i14).sortedUsersMutualSectionsArray : ContactsController.getInstance(i14).sortedUsersSectionsArray).get(i10 - ((i15 == 0 || z4) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(arrayList.get(i11).user_id));
            uaVar.d(user, null, null, false);
            uaVar.c(this.x.h(user.id) >= 0, false);
            return;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                t3 t3Var = (t3) view;
                int i16 = this.C;
                if (i16 == 0) {
                    t3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i16 == 1) {
                    t3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    t3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (i12 == 4) {
                view.setPadding(0, AndroidUtilities.dp(!this.G ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (i12 != 7) {
                if (i12 != 8) {
                    return;
                }
                o4 o4Var = (o4) view;
                int i17 = i11 - 2;
                if (i17 < 0 || i17 >= ContactsController.getInstance(i14).phoneBookContacts.size()) {
                    return;
                }
                o4Var.f = ContactsController.getInstance(i14).phoneBookContacts.get(i17);
                o4Var.h = null;
                o4Var.a();
                return;
            }
            l4 l4Var = (l4) view;
            if (this.H && i11 == 1 && i10 == 1) {
                l4Var.setText(LocaleController.getString(R.string.InviteFriends));
                return;
            } else if (this.C == 1) {
                l4Var.setText(LocaleController.getString(R.string.SortedByName));
                return;
            } else {
                l4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                return;
            }
        }
        n8 n8Var = (n8) view;
        boolean z10 = this.w;
        if (z10 || !z4) {
            int i18 = j6.G6;
            n8Var.e(i18, i18);
        } else {
            int i19 = j6.il;
            n8Var.e(i19, i19);
        }
        if (i10 != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(i14).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str == null || contact.last_name == null) {
                if (str == null || contact.last_name != null) {
                    n8Var.i(contact.last_name, false);
                    return;
                } else {
                    n8Var.i(str, false);
                    return;
                }
            }
            n8Var.i(contact.first_name + " " + contact.last_name, false);
            return;
        }
        if (z10) {
            if (i11 == 0) {
                n8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i11 == 1) {
                    n8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z4) {
            if (this.D) {
                n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                return;
            } else {
                n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                return;
            }
        }
        if (i11 == 0) {
            n8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i11 == 1) {
            n8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i10, boolean z4) {
        this.C = i10;
        if (i10 != 2) {
            l();
            return;
        }
        if (this.y == null || z4) {
            int i11 = this.r;
            this.y = new ArrayList(ContactsController.getInstance(i11).contacts);
            long j10 = UserConfig.getInstance(i11).clientUserId;
            int size = this.y.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.y.get(i12)).user_id == j10) {
                    this.y.remove(i12);
                    break;
                }
                i12++;
            }
        }
        Z();
    }

    public final void Z() {
        int i10 = this.r;
        if (this.y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.y, new p30(MessagesController.getInstance(i10), currentTime, 1));
            l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.s;
        if (i10 == 0) {
            ua uaVar = new ua(context, 58, 1, false);
            uaVar.setCallCellStyle(58);
            view = uaVar;
        } else if (i10 == 1) {
            view = new n8(context);
        } else if (i10 == 2) {
            view = new t3(context, null);
        } else if (i10 != 3) {
            if (i10 == 4) {
                FrameLayout z4Var = new z4(this, context, viewGroup, 1);
                z4Var.addView(new pq(context), b6.e(-1, -2, 17));
                z4Var.setLayoutParams(new f2.w0(-1, -2));
                z4Var.setTag(-33024);
                view2 = z4Var;
            } else if (i10 == 7) {
                view = new l4(this.s, j6.L6, 21, 14, 5, false, false, null);
            } else if (i10 == 8) {
                view = new o4(context, false);
            } else if (i10 != 9) {
                view = new y6(context, (org.telegram.ui.b) null);
            } else {
                View gnVar = new gn(context, 28);
                gnVar.setId(9);
                gnVar.setTag(-33024);
                view2 = gnVar;
            }
            view = view2;
        } else {
            View b3Var = new b3(context, null);
            b3Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
            view = b3Var;
        }
        return new dl0(view);
    }
}
