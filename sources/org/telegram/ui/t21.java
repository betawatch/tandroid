package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r21 r21Var = (r21) ((bi.j5) this.b).e;
                if (r21Var != null) {
                    r21Var.run();
                    break;
                }
                break;
            case 1:
                ((a31) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((m31) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.v3 v3Var = secretMediaViewer.r;
                        if (v3Var.V) {
                            v3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 5:
                m61 m61Var = (m61) this.b;
                if (m61Var.a0 instanceof TLRPC.User) {
                    fi.d dVar = m61Var.h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        m61Var.T((TLRPC.User) m61Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((o71) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        y9.f0(sessionsActivity.getParentActivity(), 2, new m71(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                ((id1) this.b).c(true);
                break;
            case 8:
                ((id1) ((bi.e5) this.b).c).c(true);
                break;
            case 9:
                pd1 pd1Var = (pd1) this.b;
                ArrayList arrayList = pd1Var.f;
                HashSet hashSet = pd1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = pd1Var.getMessagesController().getUser(Long.valueOf(pd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        pd1Var.getMessagesController().putChat(chat, false);
                        pd1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    pd1Var.finishFragment();
                    break;
                }
                break;
            default:
                ki1 ki1Var = (ki1) this.b;
                ki1Var.a.c(!r0.b(), true);
                ki1Var.c.setEnabled(ki1Var.a.b());
                ki1Var.c.animate().alpha(ki1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
