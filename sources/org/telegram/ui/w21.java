package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u21 u21Var = (u21) ((bg.u1) this.b).e;
                if (u21Var != null) {
                    u21Var.run();
                    break;
                }
                break;
            case 1:
                ((d31) this.b).dismiss();
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
                ((o31) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.d0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        nh.t3 t3Var = secretMediaViewer.r;
                        if (t3Var.R) {
                            t3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 5:
                n61 n61Var = (n61) this.b;
                if (n61Var.W instanceof TLRPC.User) {
                    nh.d dVar = n61Var.d0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        n61Var.T((TLRPC.User) n61Var.W, null, null);
                        break;
                    }
                }
                break;
            case 6:
                o71.a((o71) this.b);
                break;
            case 7:
                ((fd1) this.b).c(true);
                break;
            case 8:
                ((fd1) ((eg.v) this.b).c).c(true);
                break;
            case 9:
                md1 md1Var = (md1) this.b;
                ArrayList arrayList = md1Var.f;
                HashSet hashSet = md1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = md1Var.getMessagesController().getUser(Long.valueOf(md1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        md1Var.getMessagesController().putChat(chat, false);
                        md1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    md1Var.finishFragment();
                    break;
                }
                break;
            default:
                gi1 gi1Var = (gi1) this.b;
                gi1Var.a.c(!r0.b(), true);
                gi1Var.c.setEnabled(gi1Var.a.b());
                gi1Var.c.animate().alpha(gi1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
