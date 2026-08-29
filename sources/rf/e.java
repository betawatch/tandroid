package rf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f2.n1;
import i7.f6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class e extends fl0 {
    public final boolean A;
    public int B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final int v;
    public final boolean w;
    public final a0.h x;
    public ArrayList y;

    public e(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        this.s = context;
        this.v = i10;
        this.w = z10;
        this.x = hVar;
        this.A = i11 != 0;
        this.C = i11 == 2;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        if (this.B != 2 && !this.E) {
            int i11 = this.r;
            int i12 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i11);
            ArrayList<String> arrayList = i12 == 2 ? contactsController.sortedUsersMutualSectionsArray : contactsController.sortedUsersSectionsArray;
            int S = S(i10);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i12 == 0 || this.A) {
                if (S > 0 && S <= arrayList.size()) {
                    return arrayList.get(S - 1);
                }
            } else if (S >= 0 && S < arrayList.size()) {
                return arrayList.get(S);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = (int) (h() * f9);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i10) {
        boolean z10 = this.G;
        int i11 = this.r;
        if (z10) {
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
        boolean z11 = this.A;
        boolean z12 = this.w;
        if (i12 != 0 && !z11) {
            if (!this.E) {
                if (i10 < arrayList.size()) {
                    int size = hashMap.get(arrayList.get(i10)).size();
                    return (i10 != arrayList.size() - 1 || z12) ? size + 1 : size;
                }
                if (z12) {
                }
            }
            return 1;
        }
        if (i10 == 0) {
            if (this.E) {
                return 2;
            }
            return z11 ? 3 : 4;
        }
        if (!this.E) {
            if (this.B != 2) {
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
            if (z12) {
                return 0;
            }
            return ContactsController.getInstance(i11).phoneBookContacts.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override // org.telegram.ui.Components.fl0
    public final Object O(int i10, int i11) {
        int i12;
        boolean z10 = this.G;
        int i13 = this.r;
        if (z10 && i10 == 1 && i11 > 1 && i11 - 2 < ContactsController.getInstance(i13).phoneBookContacts.size()) {
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
        if (i14 != 0 && !this.A) {
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
        if (this.B != 2) {
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
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i10, int i11) {
        if (this.G) {
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
        boolean z10 = this.A;
        if (i12 == 0 || z10) {
            if (i10 == 0) {
                if (z10) {
                    if (i11 == 1) {
                        return 5;
                    }
                    if (i11 == 2) {
                        int i14 = this.B;
                        return (i14 == 1 || i14 == 2) ? 7 : 2;
                    }
                } else if (this.w) {
                    if (i11 >= 2) {
                        if (i11 == 2) {
                            return 5;
                        }
                        if (i11 == 3) {
                            if (this.E) {
                                return 5;
                            }
                            int i15 = this.B;
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
                        if (this.E) {
                            return 5;
                        }
                        int i16 = this.B;
                        if (i16 == 1 || i16 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.E) {
                    return 4;
                }
                if (this.B != 2) {
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
        if (this.E) {
            return 4;
        }
        if (i11 < hashMap.get(arrayList.get(i10)).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.fl0
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
            p4 p4Var = new p4(this.s);
            p4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(p4Var.getContext());
            p4Var.a = textView;
            th.n(22.0f, 1, textView);
            th.s(g6.B6, null, false, textView, 17);
            p4Var.addView(textView, f6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = p4Var;
        } else {
            view2 = view;
        }
        p4 p4Var2 = (p4) view2;
        if (this.B == 2 || this.D || this.E) {
            p4Var2.setLetter("");
            return view2;
        }
        if (i12 != 0 && !this.A) {
            if (i10 < arrayList.size()) {
                p4Var2.setLetter(arrayList.get(i10));
                return view2;
            }
            p4Var2.setLetter("");
            return view2;
        }
        if (i10 == 0) {
            p4Var2.setLetter("");
            return view2;
        }
        int i13 = i10 - 1;
        if (i13 < arrayList.size()) {
            p4Var2.setLetter(arrayList.get(i13));
            return view2;
        }
        p4Var2.setLetter("");
        return view2;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean V(int i10, int i11, n1 n1Var) {
        if (!this.G) {
            int i12 = this.v;
            int i13 = this.r;
            ContactsController contactsController = ContactsController.getInstance(i13);
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
            ContactsController contactsController2 = ContactsController.getInstance(i13);
            ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
            boolean z10 = this.A;
            if (i12 == 0 || z10) {
                if (i10 == 0) {
                    if (z10) {
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
                    if (this.E) {
                        return false;
                    }
                    if (this.B != 2) {
                        int i14 = i10 - 1;
                        if (i14 < arrayList.size() && i11 >= hashMap.get(arrayList.get(i14)).size()) {
                            return false;
                        }
                    } else if (i10 == 1 && i11 >= this.y.size()) {
                        return false;
                    }
                }
            } else if (this.E || i11 >= hashMap.get(arrayList.get(i10)).size()) {
                return false;
            }
        } else if (i10 != 1 || i11 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void W(int i10, int i11, n1 n1Var) {
        ArrayList<TLRPC.TL_contact> arrayList;
        int i12 = n1Var.f;
        View view = n1Var.a;
        int i13 = 7;
        boolean z10 = this.A;
        int i14 = this.r;
        if (i12 == 0) {
            sa saVar = (sa) view;
            saVar.P.a = false;
            if (this.B != 2 && !this.D) {
                i13 = 58;
            }
            saVar.b(i13, 1);
            if (this.B == 2) {
                arrayList = this.y;
            } else {
                int i15 = this.v;
                ContactsController contactsController = ContactsController.getInstance(i14);
                arrayList = (i15 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict).get((i15 == 2 ? ContactsController.getInstance(i14).sortedUsersMutualSectionsArray : ContactsController.getInstance(i14).sortedUsersSectionsArray).get(i10 - ((i15 == 0 || z10) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(arrayList.get(i11).user_id));
            saVar.d(user, null, null, false);
            saVar.c(this.x.h(user.id) >= 0, false);
            return;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                s3 s3Var = (s3) view;
                int i16 = this.B;
                if (i16 == 0) {
                    s3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i16 == 1) {
                    s3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    s3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (i12 == 4) {
                view.setPadding(0, AndroidUtilities.dp(!this.F ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (i12 != 7) {
                if (i12 != 8) {
                    return;
                }
                n4 n4Var = (n4) view;
                int i17 = i11 - 2;
                if (i17 < 0 || i17 >= ContactsController.getInstance(i14).phoneBookContacts.size()) {
                    return;
                }
                n4Var.f = ContactsController.getInstance(i14).phoneBookContacts.get(i17);
                n4Var.h = null;
                n4Var.a();
                return;
            }
            k4 k4Var = (k4) view;
            if (this.G && i11 == 1 && i10 == 1) {
                k4Var.setText(LocaleController.getString(R.string.InviteFriends));
                return;
            } else if (this.B == 1) {
                k4Var.setText(LocaleController.getString(R.string.SortedByName));
                return;
            } else {
                k4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                return;
            }
        }
        m8 m8Var = (m8) view;
        boolean z11 = this.w;
        if (z11 || !z10) {
            int i18 = g6.G6;
            m8Var.e(i18, i18);
        } else {
            int i19 = g6.il;
            m8Var.e(i19, i19);
        }
        if (i10 != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(i14).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str == null || contact.last_name == null) {
                if (str == null || contact.last_name != null) {
                    m8Var.i(contact.last_name, false);
                    return;
                } else {
                    m8Var.i(str, false);
                    return;
                }
            }
            m8Var.i(contact.first_name + " " + contact.last_name, false);
            return;
        }
        if (z11) {
            if (i11 == 0) {
                m8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i11 == 1) {
                    m8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            if (this.C) {
                m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                return;
            } else {
                m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                return;
            }
        }
        if (i11 == 0) {
            m8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i11 == 1) {
            m8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i10, boolean z10) {
        this.B = i10;
        if (i10 != 2) {
            l();
            return;
        }
        if (this.y == null || z10) {
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
            Collections.sort(this.y, new k30(MessagesController.getInstance(i10), currentTime, 1));
            l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.s;
        if (i10 == 0) {
            sa saVar = new sa(context, 58, 1, false);
            saVar.setCallCellStyle(58);
            view = saVar;
        } else if (i10 == 1) {
            view = new m8(context);
        } else if (i10 == 2) {
            view = new s3(context, null);
        } else if (i10 != 3) {
            if (i10 == 4) {
                FrameLayout dVar = new d(this, context, viewGroup, 0);
                dVar.addView(new mq(context), f6.e(-1, -2, 17));
                dVar.setLayoutParams(new f2.x0(-1, -2));
                dVar.setTag(-33024);
                view2 = dVar;
            } else if (i10 == 7) {
                view = new k4(this.s, g6.L6, 21, 14, 5, false, false, null);
            } else if (i10 == 8) {
                view = new n4(context, false);
            } else if (i10 != 9) {
                view = new x6(context, (org.telegram.ui.b) null);
            } else {
                View fnVar = new fn(context, 28);
                fnVar.setId(9);
                fnVar.setTag(-33024);
                view2 = fnVar;
            }
            view = view2;
        } else {
            View a3Var = new a3(context, null);
            a3Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
            view = a3Var;
        }
        return new vk0(view);
    }
}
